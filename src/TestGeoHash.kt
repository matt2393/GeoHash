import org.junit.Test
import kotlin.test.assertEquals


class TestGeoHash {
    @Test
    fun test1Accuracy1() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_1)
        assertEquals(result_1_1, test1, "Success")
    }
    @Test
    fun test1Accuracy2() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_2)
        assertEquals(result_1_2, test1, "Success")
    }
    @Test
    fun test1Accuracy3() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_3)
        assertEquals(result_1_3, test1, "Success")
    }
    @Test
    fun test1Accuracy4() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_4)
        assertEquals(result_1_4, test1, "Success")
    }
    @Test
    fun test1Accuracy5() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_5)
        assertEquals(result_1_5, test1, "Success")
    }
    @Test
    fun test1Accuracy6() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_6)
        assertEquals(result_1_6, test1, "Success")
    }
    @Test
    fun test1Accuracy7() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_7)
        assertEquals(result_1_7, test1, "Success")
    }
    @Test
    fun test1Accuracy8() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_8)
        assertEquals(result_1_8, test1, "Success")
    }
    @Test
    fun test1Accuracy9() {
        val test1 = GeoHash.encode(lat_1, lng_1, accuracy_1_9)
        assertEquals(result_1_9, test1, "Success")
    }


    //Test 2

    @Test
    fun test2Accuracy1() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_1)
        assertEquals(result_2_1, test2, "Success")
    }
    @Test
    fun test2Accuracy2() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_2)
        assertEquals(result_2_2, test2, "Success")
    }
    @Test
    fun test2Accuracy3() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_3)
        assertEquals(result_2_3, test2, "Success")
    }
    @Test
    fun test2Accuracy4() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_4)
        assertEquals(result_2_4, test2, "Success")
    }
    @Test
    fun test2Accuracy5() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_5)
        assertEquals(result_2_5, test2, "Success")
    }
    @Test
    fun test2Accuracy6() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_6)
        assertEquals(result_2_6, test2, "Success")
    }
    @Test
    fun test2Accuracy7() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_7)
        assertEquals(result_2_7, test2, "Success")
    }
    @Test
    fun test2Accuracy8() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_8)
        assertEquals(result_2_8, test2, "Success")
    }
    @Test
    fun test2Accuracy9() {
        val test2 = GeoHash.encode(lat_2, lng_2, accuracy_2_9)
        assertEquals(result_2_9, test2, "Success")
    }
}



/**
 * Data Test
 */

//Test 1
val lat_1 = -17.964780222340742
val lng_1 = -67.1038512600353

val accuracy_1_1 = 1
val result_1_1 = "6"

val accuracy_1_2 = 2
val result_1_2 = "6s"

val accuracy_1_3 = 3
val result_1_3 = "6sb"

val accuracy_1_4 = 4
val result_1_4 = "6sb3"

val accuracy_1_5 = 5
val result_1_5 = "6sb3c"

val accuracy_1_6 = 6
val result_1_6 = "6sb3c1"

val accuracy_1_7 = 7
val result_1_7 = "6sb3c18"

val accuracy_1_8 = 8
val result_1_8 = "6sb3c187"

val accuracy_1_9 = 9
val result_1_9 = "6sb3c187w"




//Test 2
val lat_2 = -16.49652057717659
val lng_2 = -68.1366552662803

val accuracy_2_1 = 1
val result_2_1 = "6"

val accuracy_2_2 = 2
val result_2_2 = "6m"

val accuracy_2_3 = 3
val result_2_3 = "6mp"

val accuracy_2_4 = 4
val result_2_4 = "6mpd"

val accuracy_2_5 = 5
val result_2_5 = "6mpd1"

val accuracy_2_6 = 6
val result_2_6 = "6mpd1s"

val accuracy_2_7 = 7
val result_2_7 = "6mpd1sb"

val accuracy_2_8 = 8
val result_2_8 = "6mpd1sbk"

val accuracy_2_9 = 9
val result_2_9 = "6mpd1sbku"