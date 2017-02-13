
package club.bonerbrew.nutslists;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides an abstraction for an n-dimensional {@link Map}
 * 
 * @author Rafael
 *
 * @param <K1> the type for rows
 * @param <K2> the type for columns
 * @param <K3> the type for pages
 * @param <K4> the type for frames
 * @param <K5> the type for verses
 * @param <K6> the type for universes
 * @param <K...> take a wild guess
 * @param <V> the type for values
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class HashMap145D<K1, K2, K3, K4, K5, K6, K7, K8, K9, K10, K11, K12, K13, K14, K15, K16, K17, K18, K19, K20, K21, K22, K23, K24, K25, K26, K27, K28, K29, K30, K31, K32, K33, K34, K35, K36, K37, K38, K39, K40, K41, K42, K43, K44, K45, K46, K47, K48, K49, K50, K51, K52, K53, K54, K55, K56, K57, K58, K59, K60, K61, K62, K63, K64, K65, K66, K67, K68, K69, K70, K71, K72, K73, K74, K75, K76, K77, K78, K79, K80, K81, K82, K83, K84, K85, K86, K87, K88, K89, K90, K91, K92, K93, K94, K95, K96, K97, K98, K99, K100, K101, K102, K103, K104, K105, K106, K107, K108, K109, K110, K111, K112, K113, K114, K115, K116, K117, K118, K119, K120, K121, K122, K123, K124, K125, K126, K127, K128, K129, K130, K131, K132, K133, K134, K135, K136, K137, K138, K139, K140, K141, K142, K143, K144, K145, V> extends HashMap {

    /**
     * 
     */
    private static final long serialVersionUID = 5184948037872736489L;

    /**
     * Creates an empty cube
     */
    public HashMap145D() {
        
    }

    /**
     * Constructs an empty <tt>Cube</tt> with the specified initial
     * capacity and the default load factor (0.75).
     *
     * @param  initialCapacity the initial capacity.
     * @throws IllegalArgumentException if the initial capacity is negative.
     */
    public HashMap145D(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Constructs a new <tt>Cube</tt> with the same mappings as the
     * specified <tt>Map</tt>.  The <tt>Cube</tt> is created with
     * default load factor (0.75) and an initial capacity sufficient to
     * hold the mappings in the specified <tt>Map</tt>.
     *
     * @param   m the map whose mappings are to be placed in this map
     * @throws  NullPointerException if the specified map is null
     */
    public HashMap145D(Map m) {
        super(m);
    }

    /**
     * Creates a copy of the cube denoted by {@code cube}
     * 
     * @param cube the cube to copy
     */
    public HashMap145D(HashMap145D<K1, K2, K3, K4, K5, K6, K7, K8, K9, K10, K11, K12, K13, K14, K15, K16, K17, K18, K19, K20, K21, K22, K23, K24, K25, K26, K27, K28, K29, K30, K31, K32, K33, K34, K35, K36, K37, K38, K39, K40, K41, K42, K43, K44, K45, K46, K47, K48, K49, K50, K51, K52, K53, K54, K55, K56, K57, K58, K59, K60, K61, K62, K63, K64, K65, K66, K67, K68, K69, K70, K71, K72, K73, K74, K75, K76, K77, K78, K79, K80, K81, K82, K83, K84, K85, K86, K87, K88, K89, K90, K91, K92, K93, K94, K95, K96, K97, K98, K99, K100, K101, K102, K103, K104, K105, K106, K107, K108, K109, K110, K111, K112, K113, K114, K115, K116, K117, K118, K119, K120, K121, K122, K123, K124, K125, K126, K127, K128, K129, K130, K131, K132, K133, K134, K135, K136, K137, K138, K139, K140, K141, K142, K143, K144, K145, V> cube) {
        super(cube);
    }

    public HashMap145D(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    /**
     * Gets an object at the specified row, column and page.
     * @param k1 the row
     * @param k2 the column
     * @param k3 the page
     * @return the object at the specified row, column and page, or null if there is none.
     */
    public V get(K1 k1, K2 k2, K3 k3, K4 k4, K5 k5, K6 k6, K7 k7, K8 k8, K9 k9, K10 k10, K11 k11, K12 k12, K13 k13, K14 k14, K15 k15, K16 k16, K17 k17, K18 k18, K19 k19, K20 k20, K21 k21, K22 k22, K23 k23, K24 k24, K25 k25, K26 k26, K27 k27, K28 k28, K29 k29, K30 k30, K31 k31, K32 k32, K33 k33, K34 k34, K35 k35, K36 k36, K37 k37, K38 k38, K39 k39, K40 k40, K41 k41, K42 k42, K43 k43, K44 k44, K45 k45, K46 k46, K47 k47, K48 k48, K49 k49, K50 k50, K51 k51, K52 k52, K53 k53, K54 k54, K55 k55, K56 k56, K57 k57, K58 k58, K59 k59, K60 k60, K61 k61, K62 k62, K63 k63, K64 k64, K65 k65, K66 k66, K67 k67, K68 k68, K69 k69, K70 k70, K71 k71, K72 k72, K73 k73, K74 k74, K75 k75, K76 k76, K77 k77, K78 k78, K79 k79, K80 k80, K81 k81, K82 k82, K83 k83, K84 k84, K85 k85, K86 k86, K87 k87, K88 k88, K89 k89, K90 k90, K91 k91, K92 k92, K93 k93, K94 k94, K95 k95, K96 k96, K97 k97, K98 k98, K99 k99, K100 k100, K101 k101, K102 k102, K103 k103, K104 k104, K105 k105, K106 k106, K107 k107, K108 k108, K109 k109, K110 k110, K111 k111, K112 k112, K113 k113, K114 k114, K115 k115, K116 k116, K117 k117, K118 k118, K119 k119, K120 k120, K121 k121, K122 k122, K123 k123, K124 k124, K125 k125, K126 k126, K127 k127, K128 k128, K129 k129, K130 k130, K131 k131, K132 k132, K133 k133, K134 k134, K135 k135, K136 k136, K137 k137, K138 k138, K139 k139, K140 k140, K141 k141, K142 k142, K143 k143, K144 k144, K145 k145) {
        Map m1 = (Map) super.get(k1);
        if (m1 == null) {
            return null;
        }

        
        Map m2 = (Map) m1.get(k2);
        if (m2 == null) {
            return null;
        }

        Map m3 = (Map) m2.get(k3);
        if (m3 == null) {
            return null;
        }

        Map m4 = (Map) m3.get(k4);
        if (m4 == null) {
            return null;
        }

        Map m5 = (Map) m4.get(k5);
        if (m5 == null) {
            return null;
        }

        Map m6 = (Map) m5.get(k6);
        if (m6 == null) {
            return null;
        }

        Map m7 = (Map) m6.get(k7);
        if (m7 == null) {
            return null;
        }

        Map m8 = (Map) m7.get(k8);
        if (m8 == null) {
            return null;
        }

        Map m9 = (Map) m8.get(k9);
        if (m9 == null) {
            return null;
        }

        Map m10 = (Map) m9.get(k10);
        if (m10 == null) {
            return null;
        }

        Map m11 = (Map) m10.get(k11);
        if (m11 == null) {
            return null;
        }

        Map m12 = (Map) m11.get(k12);
        if (m12 == null) {
            return null;
        }

        Map m13 = (Map) m12.get(k13);
        if (m13 == null) {
            return null;
        }

        Map m14 = (Map) m13.get(k14);
        if (m14 == null) {
            return null;
        }

        Map m15 = (Map) m14.get(k15);
        if (m15 == null) {
            return null;
        }

        Map m16 = (Map) m15.get(k16);
        if (m16 == null) {
            return null;
        }

        Map m17 = (Map) m16.get(k17);
        if (m17 == null) {
            return null;
        }

        Map m18 = (Map) m17.get(k18);
        if (m18 == null) {
            return null;
        }

        Map m19 = (Map) m18.get(k19);
        if (m19 == null) {
            return null;
        }

        Map m20 = (Map) m19.get(k20);
        if (m20 == null) {
            return null;
        }

        Map m21 = (Map) m20.get(k21);
        if (m21 == null) {
            return null;
        }

        Map m22 = (Map) m21.get(k22);
        if (m22 == null) {
            return null;
        }

        Map m23 = (Map) m22.get(k23);
        if (m23 == null) {
            return null;
        }

        Map m24 = (Map) m23.get(k24);
        if (m24 == null) {
            return null;
        }

        Map m25 = (Map) m24.get(k25);
        if (m25 == null) {
            return null;
        }

        Map m26 = (Map) m25.get(k26);
        if (m26 == null) {
            return null;
        }

        Map m27 = (Map) m26.get(k27);
        if (m27 == null) {
            return null;
        }

        Map m28 = (Map) m27.get(k28);
        if (m28 == null) {
            return null;
        }

        Map m29 = (Map) m28.get(k29);
        if (m29 == null) {
            return null;
        }

        Map m30 = (Map) m29.get(k30);
        if (m30 == null) {
            return null;
        }

        Map m31 = (Map) m30.get(k31);
        if (m31 == null) {
            return null;
        }

        Map m32 = (Map) m31.get(k32);
        if (m32 == null) {
            return null;
        }

        Map m33 = (Map) m32.get(k33);
        if (m33 == null) {
            return null;
        }

        Map m34 = (Map) m33.get(k34);
        if (m34 == null) {
            return null;
        }

        Map m35 = (Map) m34.get(k35);
        if (m35 == null) {
            return null;
        }

        Map m36 = (Map) m35.get(k36);
        if (m36 == null) {
            return null;
        }

        Map m37 = (Map) m36.get(k37);
        if (m37 == null) {
            return null;
        }

        Map m38 = (Map) m37.get(k38);
        if (m38 == null) {
            return null;
        }

        Map m39 = (Map) m38.get(k39);
        if (m39 == null) {
            return null;
        }

        Map m40 = (Map) m39.get(k40);
        if (m40 == null) {
            return null;
        }

        Map m41 = (Map) m40.get(k41);
        if (m41 == null) {
            return null;
        }

        Map m42 = (Map) m41.get(k42);
        if (m42 == null) {
            return null;
        }

        Map m43 = (Map) m42.get(k43);
        if (m43 == null) {
            return null;
        }

        Map m44 = (Map) m43.get(k44);
        if (m44 == null) {
            return null;
        }

        Map m45 = (Map) m44.get(k45);
        if (m45 == null) {
            return null;
        }

        Map m46 = (Map) m45.get(k46);
        if (m46 == null) {
            return null;
        }

        Map m47 = (Map) m46.get(k47);
        if (m47 == null) {
            return null;
        }

        Map m48 = (Map) m47.get(k48);
        if (m48 == null) {
            return null;
        }

        Map m49 = (Map) m48.get(k49);
        if (m49 == null) {
            return null;
        }

        Map m50 = (Map) m49.get(k50);
        if (m50 == null) {
            return null;
        }

        Map m51 = (Map) m50.get(k51);
        if (m51 == null) {
            return null;
        }

        Map m52 = (Map) m51.get(k52);
        if (m52 == null) {
            return null;
        }

        Map m53 = (Map) m52.get(k53);
        if (m53 == null) {
            return null;
        }

        Map m54 = (Map) m53.get(k54);
        if (m54 == null) {
            return null;
        }

        Map m55 = (Map) m54.get(k55);
        if (m55 == null) {
            return null;
        }

        Map m56 = (Map) m55.get(k56);
        if (m56 == null) {
            return null;
        }

        Map m57 = (Map) m56.get(k57);
        if (m57 == null) {
            return null;
        }

        Map m58 = (Map) m57.get(k58);
        if (m58 == null) {
            return null;
        }

        Map m59 = (Map) m58.get(k59);
        if (m59 == null) {
            return null;
        }

        Map m60 = (Map) m59.get(k60);
        if (m60 == null) {
            return null;
        }

        Map m61 = (Map) m60.get(k61);
        if (m61 == null) {
            return null;
        }

        Map m62 = (Map) m61.get(k62);
        if (m62 == null) {
            return null;
        }

        Map m63 = (Map) m62.get(k63);
        if (m63 == null) {
            return null;
        }

        Map m64 = (Map) m63.get(k64);
        if (m64 == null) {
            return null;
        }

        Map m65 = (Map) m64.get(k65);
        if (m65 == null) {
            return null;
        }

        Map m66 = (Map) m65.get(k66);
        if (m66 == null) {
            return null;
        }

        Map m67 = (Map) m66.get(k67);
        if (m67 == null) {
            return null;
        }

        Map m68 = (Map) m67.get(k68);
        if (m68 == null) {
            return null;
        }

        Map m69 = (Map) m68.get(k69);
        if (m69 == null) {
            return null;
        }

        Map m70 = (Map) m69.get(k70);
        if (m70 == null) {
            return null;
        }

        Map m71 = (Map) m70.get(k71);
        if (m71 == null) {
            return null;
        }

        Map m72 = (Map) m71.get(k72);
        if (m72 == null) {
            return null;
        }

        Map m73 = (Map) m72.get(k73);
        if (m73 == null) {
            return null;
        }

        Map m74 = (Map) m73.get(k74);
        if (m74 == null) {
            return null;
        }

        Map m75 = (Map) m74.get(k75);
        if (m75 == null) {
            return null;
        }

        Map m76 = (Map) m75.get(k76);
        if (m76 == null) {
            return null;
        }

        Map m77 = (Map) m76.get(k77);
        if (m77 == null) {
            return null;
        }

        Map m78 = (Map) m77.get(k78);
        if (m78 == null) {
            return null;
        }

        Map m79 = (Map) m78.get(k79);
        if (m79 == null) {
            return null;
        }

        Map m80 = (Map) m79.get(k80);
        if (m80 == null) {
            return null;
        }

        Map m81 = (Map) m80.get(k81);
        if (m81 == null) {
            return null;
        }

        Map m82 = (Map) m81.get(k82);
        if (m82 == null) {
            return null;
        }

        Map m83 = (Map) m82.get(k83);
        if (m83 == null) {
            return null;
        }

        Map m84 = (Map) m83.get(k84);
        if (m84 == null) {
            return null;
        }

        Map m85 = (Map) m84.get(k85);
        if (m85 == null) {
            return null;
        }

        Map m86 = (Map) m85.get(k86);
        if (m86 == null) {
            return null;
        }

        Map m87 = (Map) m86.get(k87);
        if (m87 == null) {
            return null;
        }

        Map m88 = (Map) m87.get(k88);
        if (m88 == null) {
            return null;
        }

        Map m89 = (Map) m88.get(k89);
        if (m89 == null) {
            return null;
        }

        Map m90 = (Map) m89.get(k90);
        if (m90 == null) {
            return null;
        }

        Map m91 = (Map) m90.get(k91);
        if (m91 == null) {
            return null;
        }

        Map m92 = (Map) m91.get(k92);
        if (m92 == null) {
            return null;
        }

        Map m93 = (Map) m92.get(k93);
        if (m93 == null) {
            return null;
        }

        Map m94 = (Map) m93.get(k94);
        if (m94 == null) {
            return null;
        }

        Map m95 = (Map) m94.get(k95);
        if (m95 == null) {
            return null;
        }

        Map m96 = (Map) m95.get(k96);
        if (m96 == null) {
            return null;
        }

        Map m97 = (Map) m96.get(k97);
        if (m97 == null) {
            return null;
        }

        Map m98 = (Map) m97.get(k98);
        if (m98 == null) {
            return null;
        }

        Map m99 = (Map) m98.get(k99);
        if (m99 == null) {
            return null;
        }

        Map m100 = (Map) m99.get(k100);
        if (m100 == null) {
            return null;
        }

        Map m101 = (Map) m100.get(k101);
        if (m101 == null) {
            return null;
        }

        Map m102 = (Map) m101.get(k102);
        if (m102 == null) {
            return null;
        }

        Map m103 = (Map) m102.get(k103);
        if (m103 == null) {
            return null;
        }

        Map m104 = (Map) m103.get(k104);
        if (m104 == null) {
            return null;
        }

        Map m105 = (Map) m104.get(k105);
        if (m105 == null) {
            return null;
        }

        Map m106 = (Map) m105.get(k106);
        if (m106 == null) {
            return null;
        }

        Map m107 = (Map) m106.get(k107);
        if (m107 == null) {
            return null;
        }

        Map m108 = (Map) m107.get(k108);
        if (m108 == null) {
            return null;
        }

        Map m109 = (Map) m108.get(k109);
        if (m109 == null) {
            return null;
        }

        Map m110 = (Map) m109.get(k110);
        if (m110 == null) {
            return null;
        }

        Map m111 = (Map) m110.get(k111);
        if (m111 == null) {
            return null;
        }

        Map m112 = (Map) m111.get(k112);
        if (m112 == null) {
            return null;
        }

        Map m113 = (Map) m112.get(k113);
        if (m113 == null) {
            return null;
        }

        Map m114 = (Map) m113.get(k114);
        if (m114 == null) {
            return null;
        }

        Map m115 = (Map) m114.get(k115);
        if (m115 == null) {
            return null;
        }

        Map m116 = (Map) m115.get(k116);
        if (m116 == null) {
            return null;
        }

        Map m117 = (Map) m116.get(k117);
        if (m117 == null) {
            return null;
        }

        Map m118 = (Map) m117.get(k118);
        if (m118 == null) {
            return null;
        }

        Map m119 = (Map) m118.get(k119);
        if (m119 == null) {
            return null;
        }

        Map m120 = (Map) m119.get(k120);
        if (m120 == null) {
            return null;
        }

        Map m121 = (Map) m120.get(k121);
        if (m121 == null) {
            return null;
        }

        Map m122 = (Map) m121.get(k122);
        if (m122 == null) {
            return null;
        }

        Map m123 = (Map) m122.get(k123);
        if (m123 == null) {
            return null;
        }

        Map m124 = (Map) m123.get(k124);
        if (m124 == null) {
            return null;
        }

        Map m125 = (Map) m124.get(k125);
        if (m125 == null) {
            return null;
        }

        Map m126 = (Map) m125.get(k126);
        if (m126 == null) {
            return null;
        }

        Map m127 = (Map) m126.get(k127);
        if (m127 == null) {
            return null;
        }

        Map m128 = (Map) m127.get(k128);
        if (m128 == null) {
            return null;
        }

        Map m129 = (Map) m128.get(k129);
        if (m129 == null) {
            return null;
        }

        Map m130 = (Map) m129.get(k130);
        if (m130 == null) {
            return null;
        }

        Map m131 = (Map) m130.get(k131);
        if (m131 == null) {
            return null;
        }

        Map m132 = (Map) m131.get(k132);
        if (m132 == null) {
            return null;
        }

        Map m133 = (Map) m132.get(k133);
        if (m133 == null) {
            return null;
        }

        Map m134 = (Map) m133.get(k134);
        if (m134 == null) {
            return null;
        }

        Map m135 = (Map) m134.get(k135);
        if (m135 == null) {
            return null;
        }

        Map m136 = (Map) m135.get(k136);
        if (m136 == null) {
            return null;
        }

        Map m137 = (Map) m136.get(k137);
        if (m137 == null) {
            return null;
        }

        Map m138 = (Map) m137.get(k138);
        if (m138 == null) {
            return null;
        }

        Map m139 = (Map) m138.get(k139);
        if (m139 == null) {
            return null;
        }

        Map m140 = (Map) m139.get(k140);
        if (m140 == null) {
            return null;
        }

        Map m141 = (Map) m140.get(k141);
        if (m141 == null) {
            return null;
        }

        Map m142 = (Map) m141.get(k142);
        if (m142 == null) {
            return null;
        }

        Map m143 = (Map) m142.get(k143);
        if (m143 == null) {
            return null;
        }

        Map m144 = (Map) m143.get(k144);
        if (m144 == null) {
            return null;
        }
        
        return (V) m144.get(k145);
    }

    /**
     * Puts an object at the specified row, column and page.
     * @param k1 the row
     * @param k2 the column
     * @param k3 the page
     * @return the previous object at the specified row, column and page, or null if there was none.
     */
    public V put(K1 k1, K2 k2, K3 k3, K4 k4, K5 k5, K6 k6, K7 k7, K8 k8, K9 k9, K10 k10, K11 k11, K12 k12, K13 k13, K14 k14, K15 k15, K16 k16, K17 k17, K18 k18, K19 k19, K20 k20, K21 k21, K22 k22, K23 k23, K24 k24, K25 k25, K26 k26, K27 k27, K28 k28, K29 k29, K30 k30, K31 k31, K32 k32, K33 k33, K34 k34, K35 k35, K36 k36, K37 k37, K38 k38, K39 k39, K40 k40, K41 k41, K42 k42, K43 k43, K44 k44, K45 k45, K46 k46, K47 k47, K48 k48, K49 k49, K50 k50, K51 k51, K52 k52, K53 k53, K54 k54, K55 k55, K56 k56, K57 k57, K58 k58, K59 k59, K60 k60, K61 k61, K62 k62, K63 k63, K64 k64, K65 k65, K66 k66, K67 k67, K68 k68, K69 k69, K70 k70, K71 k71, K72 k72, K73 k73, K74 k74, K75 k75, K76 k76, K77 k77, K78 k78, K79 k79, K80 k80, K81 k81, K82 k82, K83 k83, K84 k84, K85 k85, K86 k86, K87 k87, K88 k88, K89 k89, K90 k90, K91 k91, K92 k92, K93 k93, K94 k94, K95 k95, K96 k96, K97 k97, K98 k98, K99 k99, K100 k100, K101 k101, K102 k102, K103 k103, K104 k104, K105 k105, K106 k106, K107 k107, K108 k108, K109 k109, K110 k110, K111 k111, K112 k112, K113 k113, K114 k114, K115 k115, K116 k116, K117 k117, K118 k118, K119 k119, K120 k120, K121 k121, K122 k122, K123 k123, K124 k124, K125 k125, K126 k126, K127 k127, K128 k128, K129 k129, K130 k130, K131 k131, K132 k132, K133 k133, K134 k134, K135 k135, K136 k136, K137 k137, K138 k138, K139 k139, K140 k140, K141 k141, K142 k142, K143 k143, K144 k144, K145 k145, V value) {
        Map m1 = (Map) super.get(k1);
        if (m1 == null) {
            super.put(k1, m1 = new HashMap<>());
        }

        
        Map m2 = (Map) m1.get(k2);
        if (m2 == null) {
            m1.put(k2, m2 = new HashMap<>());
        }

        Map m3 = (Map) m2.get(k3);
        if (m3 == null) {
            m2.put(k3, m3 = new HashMap<>());
        }

        Map m4 = (Map) m3.get(k4);
        if (m4 == null) {
            m3.put(k4, m4 = new HashMap<>());
        }

        Map m5 = (Map) m4.get(k5);
        if (m5 == null) {
            m4.put(k5, m5 = new HashMap<>());
        }

        Map m6 = (Map) m5.get(k6);
        if (m6 == null) {
            m5.put(k6, m6 = new HashMap<>());
        }

        Map m7 = (Map) m6.get(k7);
        if (m7 == null) {
            m6.put(k7, m7 = new HashMap<>());
        }

        Map m8 = (Map) m7.get(k8);
        if (m8 == null) {
            m7.put(k8, m8 = new HashMap<>());
        }

        Map m9 = (Map) m8.get(k9);
        if (m9 == null) {
            m8.put(k9, m9 = new HashMap<>());
        }

        Map m10 = (Map) m9.get(k10);
        if (m10 == null) {
            m9.put(k10, m10 = new HashMap<>());
        }

        Map m11 = (Map) m10.get(k11);
        if (m11 == null) {
            m10.put(k11, m11 = new HashMap<>());
        }

        Map m12 = (Map) m11.get(k12);
        if (m12 == null) {
            m11.put(k12, m12 = new HashMap<>());
        }

        Map m13 = (Map) m12.get(k13);
        if (m13 == null) {
            m12.put(k13, m13 = new HashMap<>());
        }

        Map m14 = (Map) m13.get(k14);
        if (m14 == null) {
            m13.put(k14, m14 = new HashMap<>());
        }

        Map m15 = (Map) m14.get(k15);
        if (m15 == null) {
            m14.put(k15, m15 = new HashMap<>());
        }

        Map m16 = (Map) m15.get(k16);
        if (m16 == null) {
            m15.put(k16, m16 = new HashMap<>());
        }

        Map m17 = (Map) m16.get(k17);
        if (m17 == null) {
            m16.put(k17, m17 = new HashMap<>());
        }

        Map m18 = (Map) m17.get(k18);
        if (m18 == null) {
            m17.put(k18, m18 = new HashMap<>());
        }

        Map m19 = (Map) m18.get(k19);
        if (m19 == null) {
            m18.put(k19, m19 = new HashMap<>());
        }

        Map m20 = (Map) m19.get(k20);
        if (m20 == null) {
            m19.put(k20, m20 = new HashMap<>());
        }

        Map m21 = (Map) m20.get(k21);
        if (m21 == null) {
            m20.put(k21, m21 = new HashMap<>());
        }

        Map m22 = (Map) m21.get(k22);
        if (m22 == null) {
            m21.put(k22, m22 = new HashMap<>());
        }

        Map m23 = (Map) m22.get(k23);
        if (m23 == null) {
            m22.put(k23, m23 = new HashMap<>());
        }

        Map m24 = (Map) m23.get(k24);
        if (m24 == null) {
            m23.put(k24, m24 = new HashMap<>());
        }

        Map m25 = (Map) m24.get(k25);
        if (m25 == null) {
            m24.put(k25, m25 = new HashMap<>());
        }

        Map m26 = (Map) m25.get(k26);
        if (m26 == null) {
            m25.put(k26, m26 = new HashMap<>());
        }

        Map m27 = (Map) m26.get(k27);
        if (m27 == null) {
            m26.put(k27, m27 = new HashMap<>());
        }

        Map m28 = (Map) m27.get(k28);
        if (m28 == null) {
            m27.put(k28, m28 = new HashMap<>());
        }

        Map m29 = (Map) m28.get(k29);
        if (m29 == null) {
            m28.put(k29, m29 = new HashMap<>());
        }

        Map m30 = (Map) m29.get(k30);
        if (m30 == null) {
            m29.put(k30, m30 = new HashMap<>());
        }

        Map m31 = (Map) m30.get(k31);
        if (m31 == null) {
            m30.put(k31, m31 = new HashMap<>());
        }

        Map m32 = (Map) m31.get(k32);
        if (m32 == null) {
            m31.put(k32, m32 = new HashMap<>());
        }

        Map m33 = (Map) m32.get(k33);
        if (m33 == null) {
            m32.put(k33, m33 = new HashMap<>());
        }

        Map m34 = (Map) m33.get(k34);
        if (m34 == null) {
            m33.put(k34, m34 = new HashMap<>());
        }

        Map m35 = (Map) m34.get(k35);
        if (m35 == null) {
            m34.put(k35, m35 = new HashMap<>());
        }

        Map m36 = (Map) m35.get(k36);
        if (m36 == null) {
            m35.put(k36, m36 = new HashMap<>());
        }

        Map m37 = (Map) m36.get(k37);
        if (m37 == null) {
            m36.put(k37, m37 = new HashMap<>());
        }

        Map m38 = (Map) m37.get(k38);
        if (m38 == null) {
            m37.put(k38, m38 = new HashMap<>());
        }

        Map m39 = (Map) m38.get(k39);
        if (m39 == null) {
            m38.put(k39, m39 = new HashMap<>());
        }

        Map m40 = (Map) m39.get(k40);
        if (m40 == null) {
            m39.put(k40, m40 = new HashMap<>());
        }

        Map m41 = (Map) m40.get(k41);
        if (m41 == null) {
            m40.put(k41, m41 = new HashMap<>());
        }

        Map m42 = (Map) m41.get(k42);
        if (m42 == null) {
            m41.put(k42, m42 = new HashMap<>());
        }

        Map m43 = (Map) m42.get(k43);
        if (m43 == null) {
            m42.put(k43, m43 = new HashMap<>());
        }

        Map m44 = (Map) m43.get(k44);
        if (m44 == null) {
            m43.put(k44, m44 = new HashMap<>());
        }

        Map m45 = (Map) m44.get(k45);
        if (m45 == null) {
            m44.put(k45, m45 = new HashMap<>());
        }

        Map m46 = (Map) m45.get(k46);
        if (m46 == null) {
            m45.put(k46, m46 = new HashMap<>());
        }

        Map m47 = (Map) m46.get(k47);
        if (m47 == null) {
            m46.put(k47, m47 = new HashMap<>());
        }

        Map m48 = (Map) m47.get(k48);
        if (m48 == null) {
            m47.put(k48, m48 = new HashMap<>());
        }

        Map m49 = (Map) m48.get(k49);
        if (m49 == null) {
            m48.put(k49, m49 = new HashMap<>());
        }

        Map m50 = (Map) m49.get(k50);
        if (m50 == null) {
            m49.put(k50, m50 = new HashMap<>());
        }

        Map m51 = (Map) m50.get(k51);
        if (m51 == null) {
            m50.put(k51, m51 = new HashMap<>());
        }

        Map m52 = (Map) m51.get(k52);
        if (m52 == null) {
            m51.put(k52, m52 = new HashMap<>());
        }

        Map m53 = (Map) m52.get(k53);
        if (m53 == null) {
            m52.put(k53, m53 = new HashMap<>());
        }

        Map m54 = (Map) m53.get(k54);
        if (m54 == null) {
            m53.put(k54, m54 = new HashMap<>());
        }

        Map m55 = (Map) m54.get(k55);
        if (m55 == null) {
            m54.put(k55, m55 = new HashMap<>());
        }

        Map m56 = (Map) m55.get(k56);
        if (m56 == null) {
            m55.put(k56, m56 = new HashMap<>());
        }

        Map m57 = (Map) m56.get(k57);
        if (m57 == null) {
            m56.put(k57, m57 = new HashMap<>());
        }

        Map m58 = (Map) m57.get(k58);
        if (m58 == null) {
            m57.put(k58, m58 = new HashMap<>());
        }

        Map m59 = (Map) m58.get(k59);
        if (m59 == null) {
            m58.put(k59, m59 = new HashMap<>());
        }

        Map m60 = (Map) m59.get(k60);
        if (m60 == null) {
            m59.put(k60, m60 = new HashMap<>());
        }

        Map m61 = (Map) m60.get(k61);
        if (m61 == null) {
            m60.put(k61, m61 = new HashMap<>());
        }

        Map m62 = (Map) m61.get(k62);
        if (m62 == null) {
            m61.put(k62, m62 = new HashMap<>());
        }

        Map m63 = (Map) m62.get(k63);
        if (m63 == null) {
            m62.put(k63, m63 = new HashMap<>());
        }

        Map m64 = (Map) m63.get(k64);
        if (m64 == null) {
            m63.put(k64, m64 = new HashMap<>());
        }

        Map m65 = (Map) m64.get(k65);
        if (m65 == null) {
            m64.put(k65, m65 = new HashMap<>());
        }

        Map m66 = (Map) m65.get(k66);
        if (m66 == null) {
            m65.put(k66, m66 = new HashMap<>());
        }

        Map m67 = (Map) m66.get(k67);
        if (m67 == null) {
            m66.put(k67, m67 = new HashMap<>());
        }

        Map m68 = (Map) m67.get(k68);
        if (m68 == null) {
            m67.put(k68, m68 = new HashMap<>());
        }

        Map m69 = (Map) m68.get(k69);
        if (m69 == null) {
            m68.put(k69, m69 = new HashMap<>());
        }

        Map m70 = (Map) m69.get(k70);
        if (m70 == null) {
            m69.put(k70, m70 = new HashMap<>());
        }

        Map m71 = (Map) m70.get(k71);
        if (m71 == null) {
            m70.put(k71, m71 = new HashMap<>());
        }

        Map m72 = (Map) m71.get(k72);
        if (m72 == null) {
            m71.put(k72, m72 = new HashMap<>());
        }

        Map m73 = (Map) m72.get(k73);
        if (m73 == null) {
            m72.put(k73, m73 = new HashMap<>());
        }

        Map m74 = (Map) m73.get(k74);
        if (m74 == null) {
            m73.put(k74, m74 = new HashMap<>());
        }

        Map m75 = (Map) m74.get(k75);
        if (m75 == null) {
            m74.put(k75, m75 = new HashMap<>());
        }

        Map m76 = (Map) m75.get(k76);
        if (m76 == null) {
            m75.put(k76, m76 = new HashMap<>());
        }

        Map m77 = (Map) m76.get(k77);
        if (m77 == null) {
            m76.put(k77, m77 = new HashMap<>());
        }

        Map m78 = (Map) m77.get(k78);
        if (m78 == null) {
            m77.put(k78, m78 = new HashMap<>());
        }

        Map m79 = (Map) m78.get(k79);
        if (m79 == null) {
            m78.put(k79, m79 = new HashMap<>());
        }

        Map m80 = (Map) m79.get(k80);
        if (m80 == null) {
            m79.put(k80, m80 = new HashMap<>());
        }

        Map m81 = (Map) m80.get(k81);
        if (m81 == null) {
            m80.put(k81, m81 = new HashMap<>());
        }

        Map m82 = (Map) m81.get(k82);
        if (m82 == null) {
            m81.put(k82, m82 = new HashMap<>());
        }

        Map m83 = (Map) m82.get(k83);
        if (m83 == null) {
            m82.put(k83, m83 = new HashMap<>());
        }

        Map m84 = (Map) m83.get(k84);
        if (m84 == null) {
            m83.put(k84, m84 = new HashMap<>());
        }

        Map m85 = (Map) m84.get(k85);
        if (m85 == null) {
            m84.put(k85, m85 = new HashMap<>());
        }

        Map m86 = (Map) m85.get(k86);
        if (m86 == null) {
            m85.put(k86, m86 = new HashMap<>());
        }

        Map m87 = (Map) m86.get(k87);
        if (m87 == null) {
            m86.put(k87, m87 = new HashMap<>());
        }

        Map m88 = (Map) m87.get(k88);
        if (m88 == null) {
            m87.put(k88, m88 = new HashMap<>());
        }

        Map m89 = (Map) m88.get(k89);
        if (m89 == null) {
            m88.put(k89, m89 = new HashMap<>());
        }

        Map m90 = (Map) m89.get(k90);
        if (m90 == null) {
            m89.put(k90, m90 = new HashMap<>());
        }

        Map m91 = (Map) m90.get(k91);
        if (m91 == null) {
            m90.put(k91, m91 = new HashMap<>());
        }

        Map m92 = (Map) m91.get(k92);
        if (m92 == null) {
            m91.put(k92, m92 = new HashMap<>());
        }

        Map m93 = (Map) m92.get(k93);
        if (m93 == null) {
            m92.put(k93, m93 = new HashMap<>());
        }

        Map m94 = (Map) m93.get(k94);
        if (m94 == null) {
            m93.put(k94, m94 = new HashMap<>());
        }

        Map m95 = (Map) m94.get(k95);
        if (m95 == null) {
            m94.put(k95, m95 = new HashMap<>());
        }

        Map m96 = (Map) m95.get(k96);
        if (m96 == null) {
            m95.put(k96, m96 = new HashMap<>());
        }

        Map m97 = (Map) m96.get(k97);
        if (m97 == null) {
            m96.put(k97, m97 = new HashMap<>());
        }

        Map m98 = (Map) m97.get(k98);
        if (m98 == null) {
            m97.put(k98, m98 = new HashMap<>());
        }

        Map m99 = (Map) m98.get(k99);
        if (m99 == null) {
            m98.put(k99, m99 = new HashMap<>());
        }

        Map m100 = (Map) m99.get(k100);
        if (m100 == null) {
            m99.put(k100, m100 = new HashMap<>());
        }

        Map m101 = (Map) m100.get(k101);
        if (m101 == null) {
            m100.put(k101, m101 = new HashMap<>());
        }

        Map m102 = (Map) m101.get(k102);
        if (m102 == null) {
            m101.put(k102, m102 = new HashMap<>());
        }

        Map m103 = (Map) m102.get(k103);
        if (m103 == null) {
            m102.put(k103, m103 = new HashMap<>());
        }

        Map m104 = (Map) m103.get(k104);
        if (m104 == null) {
            m103.put(k104, m104 = new HashMap<>());
        }

        Map m105 = (Map) m104.get(k105);
        if (m105 == null) {
            m104.put(k105, m105 = new HashMap<>());
        }

        Map m106 = (Map) m105.get(k106);
        if (m106 == null) {
            m105.put(k106, m106 = new HashMap<>());
        }

        Map m107 = (Map) m106.get(k107);
        if (m107 == null) {
            m106.put(k107, m107 = new HashMap<>());
        }

        Map m108 = (Map) m107.get(k108);
        if (m108 == null) {
            m107.put(k108, m108 = new HashMap<>());
        }

        Map m109 = (Map) m108.get(k109);
        if (m109 == null) {
            m108.put(k109, m109 = new HashMap<>());
        }

        Map m110 = (Map) m109.get(k110);
        if (m110 == null) {
            m109.put(k110, m110 = new HashMap<>());
        }

        Map m111 = (Map) m110.get(k111);
        if (m111 == null) {
            m110.put(k111, m111 = new HashMap<>());
        }

        Map m112 = (Map) m111.get(k112);
        if (m112 == null) {
            m111.put(k112, m112 = new HashMap<>());
        }

        Map m113 = (Map) m112.get(k113);
        if (m113 == null) {
            m112.put(k113, m113 = new HashMap<>());
        }

        Map m114 = (Map) m113.get(k114);
        if (m114 == null) {
            m113.put(k114, m114 = new HashMap<>());
        }

        Map m115 = (Map) m114.get(k115);
        if (m115 == null) {
            m114.put(k115, m115 = new HashMap<>());
        }

        Map m116 = (Map) m115.get(k116);
        if (m116 == null) {
            m115.put(k116, m116 = new HashMap<>());
        }

        Map m117 = (Map) m116.get(k117);
        if (m117 == null) {
            m116.put(k117, m117 = new HashMap<>());
        }

        Map m118 = (Map) m117.get(k118);
        if (m118 == null) {
            m117.put(k118, m118 = new HashMap<>());
        }

        Map m119 = (Map) m118.get(k119);
        if (m119 == null) {
            m118.put(k119, m119 = new HashMap<>());
        }

        Map m120 = (Map) m119.get(k120);
        if (m120 == null) {
            m119.put(k120, m120 = new HashMap<>());
        }

        Map m121 = (Map) m120.get(k121);
        if (m121 == null) {
            m120.put(k121, m121 = new HashMap<>());
        }

        Map m122 = (Map) m121.get(k122);
        if (m122 == null) {
            m121.put(k122, m122 = new HashMap<>());
        }

        Map m123 = (Map) m122.get(k123);
        if (m123 == null) {
            m122.put(k123, m123 = new HashMap<>());
        }

        Map m124 = (Map) m123.get(k124);
        if (m124 == null) {
            m123.put(k124, m124 = new HashMap<>());
        }

        Map m125 = (Map) m124.get(k125);
        if (m125 == null) {
            m124.put(k125, m125 = new HashMap<>());
        }

        Map m126 = (Map) m125.get(k126);
        if (m126 == null) {
            m125.put(k126, m126 = new HashMap<>());
        }

        Map m127 = (Map) m126.get(k127);
        if (m127 == null) {
            m126.put(k127, m127 = new HashMap<>());
        }

        Map m128 = (Map) m127.get(k128);
        if (m128 == null) {
            m127.put(k128, m128 = new HashMap<>());
        }

        Map m129 = (Map) m128.get(k129);
        if (m129 == null) {
            m128.put(k129, m129 = new HashMap<>());
        }

        Map m130 = (Map) m129.get(k130);
        if (m130 == null) {
            m129.put(k130, m130 = new HashMap<>());
        }

        Map m131 = (Map) m130.get(k131);
        if (m131 == null) {
            m130.put(k131, m131 = new HashMap<>());
        }

        Map m132 = (Map) m131.get(k132);
        if (m132 == null) {
            m131.put(k132, m132 = new HashMap<>());
        }

        Map m133 = (Map) m132.get(k133);
        if (m133 == null) {
            m132.put(k133, m133 = new HashMap<>());
        }

        Map m134 = (Map) m133.get(k134);
        if (m134 == null) {
            m133.put(k134, m134 = new HashMap<>());
        }

        Map m135 = (Map) m134.get(k135);
        if (m135 == null) {
            m134.put(k135, m135 = new HashMap<>());
        }

        Map m136 = (Map) m135.get(k136);
        if (m136 == null) {
            m135.put(k136, m136 = new HashMap<>());
        }

        Map m137 = (Map) m136.get(k137);
        if (m137 == null) {
            m136.put(k137, m137 = new HashMap<>());
        }

        Map m138 = (Map) m137.get(k138);
        if (m138 == null) {
            m137.put(k138, m138 = new HashMap<>());
        }

        Map m139 = (Map) m138.get(k139);
        if (m139 == null) {
            m138.put(k139, m139 = new HashMap<>());
        }

        Map m140 = (Map) m139.get(k140);
        if (m140 == null) {
            m139.put(k140, m140 = new HashMap<>());
        }

        Map m141 = (Map) m140.get(k141);
        if (m141 == null) {
            m140.put(k141, m141 = new HashMap<>());
        }

        Map m142 = (Map) m141.get(k142);
        if (m142 == null) {
            m141.put(k142, m142 = new HashMap<>());
        }

        Map m143 = (Map) m142.get(k143);
        if (m143 == null) {
            m142.put(k143, m143 = new HashMap<>());
        }

        Map m144 = (Map) m143.get(k144);
        if (m144 == null) {
            m143.put(k144, m144 = new HashMap<>());
        }

        return (V) m144.put(k145, value);
    }

    public boolean containsKey(K1 k1, K2 k2, K3 k3, K4 k4, K5 k5, K6 k6, K7 k7, K8 k8, K9 k9, K10 k10, K11 k11, K12 k12, K13 k13, K14 k14, K15 k15, K16 k16, K17 k17, K18 k18, K19 k19, K20 k20, K21 k21, K22 k22, K23 k23, K24 k24, K25 k25, K26 k26, K27 k27, K28 k28, K29 k29, K30 k30, K31 k31, K32 k32, K33 k33, K34 k34, K35 k35, K36 k36, K37 k37, K38 k38, K39 k39, K40 k40, K41 k41, K42 k42, K43 k43, K44 k44, K45 k45, K46 k46, K47 k47, K48 k48, K49 k49, K50 k50, K51 k51, K52 k52, K53 k53, K54 k54, K55 k55, K56 k56, K57 k57, K58 k58, K59 k59, K60 k60, K61 k61, K62 k62, K63 k63, K64 k64, K65 k65, K66 k66, K67 k67, K68 k68, K69 k69, K70 k70, K71 k71, K72 k72, K73 k73, K74 k74, K75 k75, K76 k76, K77 k77, K78 k78, K79 k79, K80 k80, K81 k81, K82 k82, K83 k83, K84 k84, K85 k85, K86 k86, K87 k87, K88 k88, K89 k89, K90 k90, K91 k91, K92 k92, K93 k93, K94 k94, K95 k95, K96 k96, K97 k97, K98 k98, K99 k99, K100 k100, K101 k101, K102 k102, K103 k103, K104 k104, K105 k105, K106 k106, K107 k107, K108 k108, K109 k109, K110 k110, K111 k111, K112 k112, K113 k113, K114 k114, K115 k115, K116 k116, K117 k117, K118 k118, K119 k119, K120 k120, K121 k121, K122 k122, K123 k123, K124 k124, K125 k125, K126 k126, K127 k127, K128 k128, K129 k129, K130 k130, K131 k131, K132 k132, K133 k133, K134 k134, K135 k135, K136 k136, K137 k137, K138 k138, K139 k139, K140 k140, K141 k141, K142 k142, K143 k143, K144 k144, K145 k145) {
        Map m1 = (Map)super.get(k1);
        if (m1 == null) {
            return false;
        }

        
        Map m2 = (Map)m1.get(k2);
        if (m2 == null) {
            return false;
        }

        Map m3 = (Map)m2.get(k3);
        if (m3 == null) {
            return false;
        }

        Map m4 = (Map)m3.get(k4);
        if (m4 == null) {
            return false;
        }

        Map m5 = (Map)m4.get(k5);
        if (m5 == null) {
            return false;
        }

        Map m6 = (Map)m5.get(k6);
        if (m6 == null) {
            return false;
        }

        Map m7 = (Map)m6.get(k7);
        if (m7 == null) {
            return false;
        }

        Map m8 = (Map)m7.get(k8);
        if (m8 == null) {
            return false;
        }

        Map m9 = (Map)m8.get(k9);
        if (m9 == null) {
            return false;
        }

        Map m10 = (Map)m9.get(k10);
        if (m10 == null) {
            return false;
        }

        Map m11 = (Map)m10.get(k11);
        if (m11 == null) {
            return false;
        }

        Map m12 = (Map)m11.get(k12);
        if (m12 == null) {
            return false;
        }

        Map m13 = (Map)m12.get(k13);
        if (m13 == null) {
            return false;
        }

        Map m14 = (Map)m13.get(k14);
        if (m14 == null) {
            return false;
        }

        Map m15 = (Map)m14.get(k15);
        if (m15 == null) {
            return false;
        }

        Map m16 = (Map)m15.get(k16);
        if (m16 == null) {
            return false;
        }

        Map m17 = (Map)m16.get(k17);
        if (m17 == null) {
            return false;
        }

        Map m18 = (Map)m17.get(k18);
        if (m18 == null) {
            return false;
        }

        Map m19 = (Map)m18.get(k19);
        if (m19 == null) {
            return false;
        }

        Map m20 = (Map)m19.get(k20);
        if (m20 == null) {
            return false;
        }

        Map m21 = (Map)m20.get(k21);
        if (m21 == null) {
            return false;
        }

        Map m22 = (Map)m21.get(k22);
        if (m22 == null) {
            return false;
        }

        Map m23 = (Map)m22.get(k23);
        if (m23 == null) {
            return false;
        }

        Map m24 = (Map)m23.get(k24);
        if (m24 == null) {
            return false;
        }

        Map m25 = (Map)m24.get(k25);
        if (m25 == null) {
            return false;
        }

        Map m26 = (Map)m25.get(k26);
        if (m26 == null) {
            return false;
        }

        Map m27 = (Map)m26.get(k27);
        if (m27 == null) {
            return false;
        }

        Map m28 = (Map)m27.get(k28);
        if (m28 == null) {
            return false;
        }

        Map m29 = (Map)m28.get(k29);
        if (m29 == null) {
            return false;
        }

        Map m30 = (Map)m29.get(k30);
        if (m30 == null) {
            return false;
        }

        Map m31 = (Map)m30.get(k31);
        if (m31 == null) {
            return false;
        }

        Map m32 = (Map)m31.get(k32);
        if (m32 == null) {
            return false;
        }

        Map m33 = (Map)m32.get(k33);
        if (m33 == null) {
            return false;
        }

        Map m34 = (Map)m33.get(k34);
        if (m34 == null) {
            return false;
        }

        Map m35 = (Map)m34.get(k35);
        if (m35 == null) {
            return false;
        }

        Map m36 = (Map)m35.get(k36);
        if (m36 == null) {
            return false;
        }

        Map m37 = (Map)m36.get(k37);
        if (m37 == null) {
            return false;
        }

        Map m38 = (Map)m37.get(k38);
        if (m38 == null) {
            return false;
        }

        Map m39 = (Map)m38.get(k39);
        if (m39 == null) {
            return false;
        }

        Map m40 = (Map)m39.get(k40);
        if (m40 == null) {
            return false;
        }

        Map m41 = (Map)m40.get(k41);
        if (m41 == null) {
            return false;
        }

        Map m42 = (Map)m41.get(k42);
        if (m42 == null) {
            return false;
        }

        Map m43 = (Map)m42.get(k43);
        if (m43 == null) {
            return false;
        }

        Map m44 = (Map)m43.get(k44);
        if (m44 == null) {
            return false;
        }

        Map m45 = (Map)m44.get(k45);
        if (m45 == null) {
            return false;
        }

        Map m46 = (Map)m45.get(k46);
        if (m46 == null) {
            return false;
        }

        Map m47 = (Map)m46.get(k47);
        if (m47 == null) {
            return false;
        }

        Map m48 = (Map)m47.get(k48);
        if (m48 == null) {
            return false;
        }

        Map m49 = (Map)m48.get(k49);
        if (m49 == null) {
            return false;
        }

        Map m50 = (Map)m49.get(k50);
        if (m50 == null) {
            return false;
        }

        Map m51 = (Map)m50.get(k51);
        if (m51 == null) {
            return false;
        }

        Map m52 = (Map)m51.get(k52);
        if (m52 == null) {
            return false;
        }

        Map m53 = (Map)m52.get(k53);
        if (m53 == null) {
            return false;
        }

        Map m54 = (Map)m53.get(k54);
        if (m54 == null) {
            return false;
        }

        Map m55 = (Map)m54.get(k55);
        if (m55 == null) {
            return false;
        }

        Map m56 = (Map)m55.get(k56);
        if (m56 == null) {
            return false;
        }

        Map m57 = (Map)m56.get(k57);
        if (m57 == null) {
            return false;
        }

        Map m58 = (Map)m57.get(k58);
        if (m58 == null) {
            return false;
        }

        Map m59 = (Map)m58.get(k59);
        if (m59 == null) {
            return false;
        }

        Map m60 = (Map)m59.get(k60);
        if (m60 == null) {
            return false;
        }

        Map m61 = (Map)m60.get(k61);
        if (m61 == null) {
            return false;
        }

        Map m62 = (Map)m61.get(k62);
        if (m62 == null) {
            return false;
        }

        Map m63 = (Map)m62.get(k63);
        if (m63 == null) {
            return false;
        }

        Map m64 = (Map)m63.get(k64);
        if (m64 == null) {
            return false;
        }

        Map m65 = (Map)m64.get(k65);
        if (m65 == null) {
            return false;
        }

        Map m66 = (Map)m65.get(k66);
        if (m66 == null) {
            return false;
        }

        Map m67 = (Map)m66.get(k67);
        if (m67 == null) {
            return false;
        }

        Map m68 = (Map)m67.get(k68);
        if (m68 == null) {
            return false;
        }

        Map m69 = (Map)m68.get(k69);
        if (m69 == null) {
            return false;
        }

        Map m70 = (Map)m69.get(k70);
        if (m70 == null) {
            return false;
        }

        Map m71 = (Map)m70.get(k71);
        if (m71 == null) {
            return false;
        }

        Map m72 = (Map)m71.get(k72);
        if (m72 == null) {
            return false;
        }

        Map m73 = (Map)m72.get(k73);
        if (m73 == null) {
            return false;
        }

        Map m74 = (Map)m73.get(k74);
        if (m74 == null) {
            return false;
        }

        Map m75 = (Map)m74.get(k75);
        if (m75 == null) {
            return false;
        }

        Map m76 = (Map)m75.get(k76);
        if (m76 == null) {
            return false;
        }

        Map m77 = (Map)m76.get(k77);
        if (m77 == null) {
            return false;
        }

        Map m78 = (Map)m77.get(k78);
        if (m78 == null) {
            return false;
        }

        Map m79 = (Map)m78.get(k79);
        if (m79 == null) {
            return false;
        }

        Map m80 = (Map)m79.get(k80);
        if (m80 == null) {
            return false;
        }

        Map m81 = (Map)m80.get(k81);
        if (m81 == null) {
            return false;
        }

        Map m82 = (Map)m81.get(k82);
        if (m82 == null) {
            return false;
        }

        Map m83 = (Map)m82.get(k83);
        if (m83 == null) {
            return false;
        }

        Map m84 = (Map)m83.get(k84);
        if (m84 == null) {
            return false;
        }

        Map m85 = (Map)m84.get(k85);
        if (m85 == null) {
            return false;
        }

        Map m86 = (Map)m85.get(k86);
        if (m86 == null) {
            return false;
        }

        Map m87 = (Map)m86.get(k87);
        if (m87 == null) {
            return false;
        }

        Map m88 = (Map)m87.get(k88);
        if (m88 == null) {
            return false;
        }

        Map m89 = (Map)m88.get(k89);
        if (m89 == null) {
            return false;
        }

        Map m90 = (Map)m89.get(k90);
        if (m90 == null) {
            return false;
        }

        Map m91 = (Map)m90.get(k91);
        if (m91 == null) {
            return false;
        }

        Map m92 = (Map)m91.get(k92);
        if (m92 == null) {
            return false;
        }

        Map m93 = (Map)m92.get(k93);
        if (m93 == null) {
            return false;
        }

        Map m94 = (Map)m93.get(k94);
        if (m94 == null) {
            return false;
        }

        Map m95 = (Map)m94.get(k95);
        if (m95 == null) {
            return false;
        }

        Map m96 = (Map)m95.get(k96);
        if (m96 == null) {
            return false;
        }

        Map m97 = (Map)m96.get(k97);
        if (m97 == null) {
            return false;
        }

        Map m98 = (Map)m97.get(k98);
        if (m98 == null) {
            return false;
        }

        Map m99 = (Map)m98.get(k99);
        if (m99 == null) {
            return false;
        }

        Map m100 = (Map)m99.get(k100);
        if (m100 == null) {
            return false;
        }

        Map m101 = (Map)m100.get(k101);
        if (m101 == null) {
            return false;
        }

        Map m102 = (Map)m101.get(k102);
        if (m102 == null) {
            return false;
        }

        Map m103 = (Map)m102.get(k103);
        if (m103 == null) {
            return false;
        }

        Map m104 = (Map)m103.get(k104);
        if (m104 == null) {
            return false;
        }

        Map m105 = (Map)m104.get(k105);
        if (m105 == null) {
            return false;
        }

        Map m106 = (Map)m105.get(k106);
        if (m106 == null) {
            return false;
        }

        Map m107 = (Map)m106.get(k107);
        if (m107 == null) {
            return false;
        }

        Map m108 = (Map)m107.get(k108);
        if (m108 == null) {
            return false;
        }

        Map m109 = (Map)m108.get(k109);
        if (m109 == null) {
            return false;
        }

        Map m110 = (Map)m109.get(k110);
        if (m110 == null) {
            return false;
        }

        Map m111 = (Map)m110.get(k111);
        if (m111 == null) {
            return false;
        }

        Map m112 = (Map)m111.get(k112);
        if (m112 == null) {
            return false;
        }

        Map m113 = (Map)m112.get(k113);
        if (m113 == null) {
            return false;
        }

        Map m114 = (Map)m113.get(k114);
        if (m114 == null) {
            return false;
        }

        Map m115 = (Map)m114.get(k115);
        if (m115 == null) {
            return false;
        }

        Map m116 = (Map)m115.get(k116);
        if (m116 == null) {
            return false;
        }

        Map m117 = (Map)m116.get(k117);
        if (m117 == null) {
            return false;
        }

        Map m118 = (Map)m117.get(k118);
        if (m118 == null) {
            return false;
        }

        Map m119 = (Map)m118.get(k119);
        if (m119 == null) {
            return false;
        }

        Map m120 = (Map)m119.get(k120);
        if (m120 == null) {
            return false;
        }

        Map m121 = (Map)m120.get(k121);
        if (m121 == null) {
            return false;
        }

        Map m122 = (Map)m121.get(k122);
        if (m122 == null) {
            return false;
        }

        Map m123 = (Map)m122.get(k123);
        if (m123 == null) {
            return false;
        }

        Map m124 = (Map)m123.get(k124);
        if (m124 == null) {
            return false;
        }

        Map m125 = (Map)m124.get(k125);
        if (m125 == null) {
            return false;
        }

        Map m126 = (Map)m125.get(k126);
        if (m126 == null) {
            return false;
        }

        Map m127 = (Map)m126.get(k127);
        if (m127 == null) {
            return false;
        }

        Map m128 = (Map)m127.get(k128);
        if (m128 == null) {
            return false;
        }

        Map m129 = (Map)m128.get(k129);
        if (m129 == null) {
            return false;
        }

        Map m130 = (Map)m129.get(k130);
        if (m130 == null) {
            return false;
        }

        Map m131 = (Map)m130.get(k131);
        if (m131 == null) {
            return false;
        }

        Map m132 = (Map)m131.get(k132);
        if (m132 == null) {
            return false;
        }

        Map m133 = (Map)m132.get(k133);
        if (m133 == null) {
            return false;
        }

        Map m134 = (Map)m133.get(k134);
        if (m134 == null) {
            return false;
        }

        Map m135 = (Map)m134.get(k135);
        if (m135 == null) {
            return false;
        }

        Map m136 = (Map)m135.get(k136);
        if (m136 == null) {
            return false;
        }

        Map m137 = (Map)m136.get(k137);
        if (m137 == null) {
            return false;
        }

        Map m138 = (Map)m137.get(k138);
        if (m138 == null) {
            return false;
        }

        Map m139 = (Map)m138.get(k139);
        if (m139 == null) {
            return false;
        }

        Map m140 = (Map)m139.get(k140);
        if (m140 == null) {
            return false;
        }

        Map m141 = (Map)m140.get(k141);
        if (m141 == null) {
            return false;
        }

        Map m142 = (Map)m141.get(k142);
        if (m142 == null) {
            return false;
        }

        Map m143 = (Map)m142.get(k143);
        if (m143 == null) {
            return false;
        }

        Map m144 = (Map)m143.get(k144);
        if (m144 == null) {
            return false;
        }
                
        return m144.containsKey(k145);
    }
    
    public boolean containsValue(Object value) {
        if (value instanceof Map) {
            return super.containsValue(value);
        } else {
            throw new UnsupportedOperationException("use #containsAnyValue(V) instead!");
        }
    }

    public boolean containsAnyValue(V value) {
        for (Object m1 : super.values()) {
            for (Object m2 : ((Map) m1).values()) {for (Object m3 : ((Map) m2).values()) {for (Object m4 : ((Map) m3).values()) {for (Object m5 : ((Map) m4).values()) {for (Object m6 : ((Map) m5).values()) {for (Object m7 : ((Map) m6).values()) {for (Object m8 : ((Map) m7).values()) {for (Object m9 : ((Map) m8).values()) {for (Object m10 : ((Map) m9).values()) {for (Object m11 : ((Map) m10).values()) {for (Object m12 : ((Map) m11).values()) {for (Object m13 : ((Map) m12).values()) {for (Object m14 : ((Map) m13).values()) {for (Object m15 : ((Map) m14).values()) {for (Object m16 : ((Map) m15).values()) {for (Object m17 : ((Map) m16).values()) {for (Object m18 : ((Map) m17).values()) {for (Object m19 : ((Map) m18).values()) {for (Object m20 : ((Map) m19).values()) {for (Object m21 : ((Map) m20).values()) {for (Object m22 : ((Map) m21).values()) {for (Object m23 : ((Map) m22).values()) {for (Object m24 : ((Map) m23).values()) {for (Object m25 : ((Map) m24).values()) {for (Object m26 : ((Map) m25).values()) {for (Object m27 : ((Map) m26).values()) {for (Object m28 : ((Map) m27).values()) {for (Object m29 : ((Map) m28).values()) {for (Object m30 : ((Map) m29).values()) {for (Object m31 : ((Map) m30).values()) {for (Object m32 : ((Map) m31).values()) {for (Object m33 : ((Map) m32).values()) {for (Object m34 : ((Map) m33).values()) {for (Object m35 : ((Map) m34).values()) {for (Object m36 : ((Map) m35).values()) {for (Object m37 : ((Map) m36).values()) {for (Object m38 : ((Map) m37).values()) {for (Object m39 : ((Map) m38).values()) {for (Object m40 : ((Map) m39).values()) {for (Object m41 : ((Map) m40).values()) {for (Object m42 : ((Map) m41).values()) {for (Object m43 : ((Map) m42).values()) {for (Object m44 : ((Map) m43).values()) {for (Object m45 : ((Map) m44).values()) {for (Object m46 : ((Map) m45).values()) {for (Object m47 : ((Map) m46).values()) {for (Object m48 : ((Map) m47).values()) {for (Object m49 : ((Map) m48).values()) {for (Object m50 : ((Map) m49).values()) {for (Object m51 : ((Map) m50).values()) {for (Object m52 : ((Map) m51).values()) {for (Object m53 : ((Map) m52).values()) {for (Object m54 : ((Map) m53).values()) {for (Object m55 : ((Map) m54).values()) {for (Object m56 : ((Map) m55).values()) {for (Object m57 : ((Map) m56).values()) {for (Object m58 : ((Map) m57).values()) {for (Object m59 : ((Map) m58).values()) {for (Object m60 : ((Map) m59).values()) {for (Object m61 : ((Map) m60).values()) {for (Object m62 : ((Map) m61).values()) {for (Object m63 : ((Map) m62).values()) {for (Object m64 : ((Map) m63).values()) {for (Object m65 : ((Map) m64).values()) {for (Object m66 : ((Map) m65).values()) {for (Object m67 : ((Map) m66).values()) {for (Object m68 : ((Map) m67).values()) {for (Object m69 : ((Map) m68).values()) {for (Object m70 : ((Map) m69).values()) {for (Object m71 : ((Map) m70).values()) {for (Object m72 : ((Map) m71).values()) {for (Object m73 : ((Map) m72).values()) {for (Object m74 : ((Map) m73).values()) {for (Object m75 : ((Map) m74).values()) {for (Object m76 : ((Map) m75).values()) {for (Object m77 : ((Map) m76).values()) {for (Object m78 : ((Map) m77).values()) {for (Object m79 : ((Map) m78).values()) {for (Object m80 : ((Map) m79).values()) {for (Object m81 : ((Map) m80).values()) {for (Object m82 : ((Map) m81).values()) {for (Object m83 : ((Map) m82).values()) {for (Object m84 : ((Map) m83).values()) {for (Object m85 : ((Map) m84).values()) {for (Object m86 : ((Map) m85).values()) {for (Object m87 : ((Map) m86).values()) {for (Object m88 : ((Map) m87).values()) {for (Object m89 : ((Map) m88).values()) {for (Object m90 : ((Map) m89).values()) {for (Object m91 : ((Map) m90).values()) {for (Object m92 : ((Map) m91).values()) {for (Object m93 : ((Map) m92).values()) {for (Object m94 : ((Map) m93).values()) {for (Object m95 : ((Map) m94).values()) {for (Object m96 : ((Map) m95).values()) {for (Object m97 : ((Map) m96).values()) {for (Object m98 : ((Map) m97).values()) {for (Object m99 : ((Map) m98).values()) {for (Object m100 : ((Map) m99).values()) {for (Object m101 : ((Map) m100).values()) {for (Object m102 : ((Map) m101).values()) {for (Object m103 : ((Map) m102).values()) {for (Object m104 : ((Map) m103).values()) {for (Object m105 : ((Map) m104).values()) {for (Object m106 : ((Map) m105).values()) {for (Object m107 : ((Map) m106).values()) {for (Object m108 : ((Map) m107).values()) {for (Object m109 : ((Map) m108).values()) {for (Object m110 : ((Map) m109).values()) {for (Object m111 : ((Map) m110).values()) {for (Object m112 : ((Map) m111).values()) {for (Object m113 : ((Map) m112).values()) {for (Object m114 : ((Map) m113).values()) {for (Object m115 : ((Map) m114).values()) {for (Object m116 : ((Map) m115).values()) {for (Object m117 : ((Map) m116).values()) {for (Object m118 : ((Map) m117).values()) {for (Object m119 : ((Map) m118).values()) {for (Object m120 : ((Map) m119).values()) {for (Object m121 : ((Map) m120).values()) {for (Object m122 : ((Map) m121).values()) {for (Object m123 : ((Map) m122).values()) {for (Object m124 : ((Map) m123).values()) {for (Object m125 : ((Map) m124).values()) {for (Object m126 : ((Map) m125).values()) {for (Object m127 : ((Map) m126).values()) {for (Object m128 : ((Map) m127).values()) {for (Object m129 : ((Map) m128).values()) {for (Object m130 : ((Map) m129).values()) {for (Object m131 : ((Map) m130).values()) {for (Object m132 : ((Map) m131).values()) {for (Object m133 : ((Map) m132).values()) {for (Object m134 : ((Map) m133).values()) {for (Object m135 : ((Map) m134).values()) {for (Object m136 : ((Map) m135).values()) {for (Object m137 : ((Map) m136).values()) {for (Object m138 : ((Map) m137).values()) {for (Object m139 : ((Map) m138).values()) {for (Object m140 : ((Map) m139).values()) {for (Object m141 : ((Map) m140).values()) {for (Object m142 : ((Map) m141).values()) {for (Object m143 : ((Map) m142).values()) {for (Object m144 : ((Map) m143).values()) {
            if (((Map) m144).containsValue(value)) return true;
            }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
        }
        return false;
    }
}

