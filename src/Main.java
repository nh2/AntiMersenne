public class Main {

	static int[] state;
	static int currentIndex;

	public static void main(String[] args) {
		state = new int[624];
		currentIndex = 0;

//		initialize(0);

//		for (int i = 0; i < 5; i++) {
//			System.out.println(state[i]);
//		}

		// for (int i = 0; i < 5; i++) {
		// System.out.println(nextNumber());
		// }
		
		if (args.length != 624) {
			System.err.println("must be 624 args");
			System.exit(1);
		}
		int[] arr = new int[624];
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
//		int[] arr = new int[] {-668203059, 1654615998, -1039577940, -471398782, 1806341205, 173879092, 1112038970, -148327174, -2099059102, 2087043557, 1739178872, -351180877, -928577991, -730776224, 1302718217, -138297977, 2046968324, 1537810351, -1789360513, -465313928, -394652141, 938204377, -2127353738, 598176026, 1210484339, 600203567, -1048812935, 407295012, -1639092676, -861559391, 1075916535, -54721341, -387636886, -2007623918, -73935819, -1266275551, -815110754, -1709817594, -420194037, 631194409, 1332073689, 424185324, -1160363781, 316721330, -434486244, -642210028, -1357278678, 1418186270, 2027837527, -1890585826, 432508404, 1519522183, 1864753826, 1358054485, -1671227719, -1544369729, -373614660, 878225224, -143424575, -1921896188, 2048741382, 1901353491, -578489442, -2055770470, 1118805955, 267488770, -837399110, -350190618, -1938321754, -360800951, 60308648, 400599612, -1203859220, -686802991, 1712934065, -1244452074, -752285108, -923212848, -1425271167, -1609471003, 4908357, -1666889315, 2119900799, -738462598, -568641750, 1430804514, 1047589226, -1158444678, 1396742090, -1272845589, -556321816, 270515404, 820626892, -356400817, -1857527217, 952210990, 1024847607, -844626580, -139413550, 612008755, -845337731, -1962843199, 1924014660, 391769539, 345512145, -29113186, 1374624034, -536496032, -2113378858, -8711794, -288476533, 2101470722, 468399889, 1294704107, -1927292489, 1250224899, -1260309123, 536057929, -1943726486, 1429152570, -796858770, -333934853, -1974466879, 872745308, -155312270, -861454009, -1704304750, -1944631897, -1771171209, 1235478542, 1911213317, 393556845, -1733934739, -867862495, 1653137829, 1361705852, -1822565006, 1039842312, 1246955724, 789710164, 813429542, -766792476, 801997237, 141615452, -1663126554, -80317000, -1474636681, 1116932915, 2046685052, 296718909, 385792672, -1379870086, -1041083208, 559309739, -529267221, 642313784, -329076024, 165964262, -676628184, 344663896, -437343114, -1291398744, -330358405, -732889526, -1973108295, -1359364085, 1680603714, -696363523, -1265798159, -2041939376, 1183839549, -2053895897, -809048539, 1011472239, -646452845, 924282500, -450804218, -1376647162, -1761790512, -750488432, -215758220, 1801409089, -1805196174, 1182021441, 1935153793, 2115938757, -1459234992, -1541047910, -16072463, -1287521587, -356734768, -75332083, -887661990, 1534881946, 353789296, 1392964597, -1663083898, 495423391, 2089261940, -1773500660, -1588505081, 1439975734, -665386750, 817670926, 1043830061, 69617246, -1153245006, 1164099199, 503087954, -1265584632, 946870804, 1597986360, -882259400, 732213632, 1428231901, 1830219288, -790647229, 267114565, 432105997, -931498909, 628604922, -621384609, -1298494714, 939625287, 194278833, -785462332, -1830231447, -1571071491, -386478286, -272645730, -2000604499, -1708664744, -1371859220, 317814271, 114661864, 534481714, -1567663440, 809689893, -1690763648, -729774497, -1821268193, 514088150, 1680231637, 393126321, 1589738942, -713632747, -83680351, 498414388, 156302611, -1694346684, 92928119, 835761764, -167369407, -125877251, 794448426, -1210694021, 532125690, 2058292873, 904419226, -1171859375, -855786853, 262357606, -270715400, -1377193292, 97850419, -1957493987, 1828018965, -1629510694, 435940125, -704792726, 1116347426, 300666185, 948454521, 309116047, -1516442472, 1293049471, 1504501144, 1872900585, 774459493, 262175295, -2131864978, 2006313350, 169130250, -1733084050, 433453424, -1291397376, -50529663, 1680518472, 856226606, 1117263813, 1539983294, -410604745, -1152776501, 2019563010, -694382142, -419600152, -350116874, -1847830033, 727673138, -1298381187, -1405998062, 873659410, -143671368, -999231257, 249326891, -907748686, -1390702752, 679500893, -663896303, 695587449, 1470221169, -2020892821, 1076693935, 503425332, -1731767803, -337505432, 1899724293, -1436212053, 750843993, 56709708, 2025615733, -1368889078, 1760530271, -429075602, -1850646691, -537709749, -2110546397, -354287010, 1337650368, -1507819197, 1533954791, 1669205724, -697239960, -1470527220, 1077747587, 658902818, -1887207689, -1327906134, 53413578, 1966898329, -1109929573, 339619332, 1442750606, -1120917222, 196264944, -1957132854, 1206384019, 579123108, 1031352225, -1021486441, -201307945, 2069431579, 1512797275, -1674454606, 1236426221, -1402721460, 1542757380, -1759743955, -228037718, -464098948, -1573040995, -628034252, -1627462556, 568414356, -1221405585, 1332717957, 1666521335, -1080244923, 1779911708, -734856997, -1499661435, 346703132, 6546479, -1741278839, 825963191, -1294577489, 1436244341, 687537412, 1028283729, 958197830, -1557357713, 1924726585, 1626281073, -1244037385, -535052464, -1401124861, -1854775542, -538856697, 1779861933, 135486808, 1727723913, -551095017, -1280632020, -1857692155, 1796269370, -978454911, -1450857631, -1249809548, 200917231, 711568583, 1912773091, 274389611, 1113371136, -1281978281, 677258676, 1917121846, -2029057972, -494155265, 2092789797, -394965805, -1883751509, -1700904176, -1050184897, 297036, -498752416, 167117967, 2124216399, 1399918423, 1340279962, -696914953, 2005286885, 214134156, -820141808, -761412129, -536800795, -110909457, -805671715, 1783001626, 807459420, -1938911177, -2489546, -158751579, -1575871803, -92033628, 358488241, -698153827, -1178735059, 560586626, -56601290, 63261809, 1725790100, -216691700, -1380767541, 1793084754, 1357970475, 14572021, 917081460, 61380729, -1214083574, -1053324315, 10125659, -84848613, -761362797, -1392592053, -2025738607, -1666181183, 419980565, 818019178, 510688338, -1682082547, -1506393508, 852621339, -542652691, 1298867023, 1202516726, -1337710518, -92276545, 782633881, 430272795, 2042709959, -627331049, -331701484, 1703797118, -1599277879, 349375932, 93825718, 1179886944, -369877824, 1945526488, -859746991, -891886316, 497268706, -595454681, 1101610896, 573036909, -1487918463, -2057866902, -784805552, -1499874592, -1524968205, 1490581366, 494390848, -550340611, 663315337, 1195761054, -638920410, 79776130, 181666837, 174647438, 883628285, -1370108417, 1115271501, -1896847660, 1351683036, -229769768, 1575796842, -264403350, -1857711698, -387186253, -646659770, 180408077, -659879120, -1077457751, -166632242, -1282800133, -1685360223, -1480209529, 2123799795, -1235414490, -1528392247, -417856734, 1969948437, -1545581765, 1870203225, 1599657397, -552286702, -1984580760, 765742497, 892683641, 1613099182, -1773282441, 1249987923, 38212703, 594668076, 648639589, 1165540019, 1431978117, 1449598999, -903561651, 1577118317, -1209035748, 402470710, 1452798332, -947397125, -1629776398, 153182031, 176965319, 1158018294, 703775687, 641736990, -77678490, -1789063561, 1243525559, 1550082102, 1695618646, -45943145, -1939245169, 556803596, 1260173501, 493476348, 2053272110, -1157400341, 1029529788, -284524051, 207259503, 1322333523, 771319623, -614023206, -2048483671, -1165393187, 304353766, 1299960583, 1731598297, -706265537, 1410985724, 1285163745, 1781215744, 466654280, 426921187, -1886220859, -392312811, 2066619266, 2035834473, 1447749897, -683551223, -868123012, -102093724, -806042261, 1475972382, 533970967, 2057660952, 498250834, -1290228404, 2137753491, 1831955274, 162454480, 1296664028, 1439165853, -1139235829, -1343850230, -453549474, 668572195, -344933787, 715353335, -1603130720, -1870512422, 1613066649, -832714745, -109261737, -36508294, -1551004932, 373326185, 282757781, -825610525, 363653025, 850576530, -1074302002, 949439989, 262663685, 1652754537, 33719836, 421235423, 1691392275, -1904927049};
		
		rev(arr);
		
		for (int i = 0; i < 624; i++) {
			System.out.println(state[i]);			
		}

//		System.out.println("currentIndex " + currentIndex);
//		System.out.println("state[currentIndex] " + state[currentIndex]);
//		System.out.println("next " + nextNumber());
		
		// want -2065863258
	}

	static void nextState() {
		// Iterate through the state
		for (int i = 0; i < 624; i++) {
			// y is the first bit of the current number,
			// and the last 31 bits of the next number
			int y = (state[i] & 0x80000000)
					+ (state[(i + 1) % 624] & 0x7fffffff);
			// first bitshift y by 1 to the right
			int next = y >>> 1;
			// xor it with the 397th next number
			next ^= state[(i + 397) % 624];
			// if y is odd, xor with magic number
			if ((y & 1L) == 1L) {
				next ^= 0x9908b0df;
			}
			// now we have the result
			state[i] = next;
		}
	}

	static int nextNumber() {
		currentIndex++;
		int tmp = state[currentIndex];
		tmp ^= (tmp >>> 11);
		tmp ^= (tmp << 7) & 0x9d2c5680;
		tmp ^= (tmp << 15) & 0xefc60000;
		tmp ^= (tmp >>> 18);
		return tmp;
	}

	static void initialize(int seed) {

		// http://code.activestate.com/recipes/578056-mersenne-twister/

		// global MT
		// global bitmask_1
		// MT[0] = seed
		// for i in xrange(1,624):
		// MT[i] = ((1812433253 * MT[i-1]) ^ ((MT[i-1] >> 30) + i)) & bitmask_1

		// copied Python 2.7's impl (probably uint problems)
		state[0] = seed;
		for (int i = 1; i < 624; i++) {
			state[i] = ((1812433253 * state[i - 1]) ^ ((state[i - 1] >> 30) + i)) & 0xffffffff;
		}
	}

	static int unBitshiftRightXor(int value, int shift) {
		// we part of the value we are up to (with a width of shift bits)
		int i = 0;
		// we accumulate the result here
		int result = 0;
		// iterate until we've done the full 32 bits
		while (i * shift < 32) {
			// create a mask for this part
			int partMask = (-1 << (32 - shift)) >>> (shift * i);
			// obtain the part
			int part = value & partMask;
			// unapply the xor from the next part of the integer
			value ^= part >>> shift;
			// add the part to the result
			result |= part;
			i++;
		}
		return result;
	}

	static int unBitshiftLeftXor(int value, int shift, int mask) {
		// we part of the value we are up to (with a width of shift bits)
		int i = 0;
		// we accumulate the result here
		int result = 0;
		// iterate until we've done the full 32 bits
		while (i * shift < 32) {
			// create a mask for this part
			int partMask = (-1 >>> (32 - shift)) << (shift * i);
			// obtain the part
			int part = value & partMask;
			// unapply the xor from the next part of the integer
			value ^= (part << shift) & mask;
			// add the part to the result
			result |= part;
			i++;
		}
		return result;
	}

	static void rev(int[] nums) {
		for (int i = 0; i < 624; i++) {

			int value = nums[i];
			value = unBitshiftRightXor(value, 18);
			value = unBitshiftLeftXor(value, 15, 0xefc60000);
			value = unBitshiftLeftXor(value, 7, 0x9d2c5680);
			value = unBitshiftRightXor(value, 11);
			
			state[i] = value;
		}
	}
}