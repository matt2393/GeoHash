object GeoHash {

    private const val base32 = "0123456789bcdefghjkmnpqrstuvwxyz"

    //Accuracy
    const val a1 = 1 // ≤ 5000km	×	5000km
    const val a2 = 2 // ≤ 1250km	×	625km
    const val a3 = 3  // ≤ 156km	×	156km
    const val a4 = 4  // ≤ 39.1km	×	19.5km
    const val a5 = 5  // ≤ 4.89km	×	4.89km
    const val a6 = 6  // ≤ 1.22km	×	0.61km
    const val a7 = 7  // ≤ 153m	×	153m
    const val a8 = 8  // ≤ 38.2m	×	19.1m
    const val a9 = 9  // ≤ 4.77m	×	4.77m
    const val a10 = 10  // ≤ 1.19m	×	0.596m
    const val a11 = 11  // ≤ 149mm	×	149mm
    const val a12 = 12  // ≤ 37.2mm	×	18.6mm

    fun encode(lat: Double, lng: Double, accuracy: Int): String {
        if (accuracy < 1) throw Exception("Invalid Accuracy")

        var idx: Int = 0
        var bit: Int = 0
        var evenBit: Boolean = true
        var geoHashEncode: String = ""

        var latMin: Double = -90.0
        var latMax: Double = 90.0
        var lonMin: Double = -180.0
        var lonMax: Double = 180.0

        while (geoHashEncode.length < accuracy) {
            if (evenBit) {
                val lonMid = (lonMin + lonMax) / 2.0
                if (lng >= lonMid) {
                    idx = idx * 2 + 1
                    lonMin = lonMid
                } else {
                    idx *= 2
                    lonMax = lonMid
                }
            } else {
                val latMid = (latMin + latMax) / 2
                if (lat >= latMid) {
                    idx = idx * 2 + 1
                    latMin = latMid
                } else {
                    idx *= 2
                    latMax = latMid
                }
            }
            evenBit = !evenBit

            if (++bit == 5) {
                geoHashEncode += base32[idx]
                bit = 0
                idx = 0
            }
        }

        return geoHashEncode
    }
}