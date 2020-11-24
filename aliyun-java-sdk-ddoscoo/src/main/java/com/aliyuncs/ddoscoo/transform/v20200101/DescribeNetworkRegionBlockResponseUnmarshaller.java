/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRegionBlockResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRegionBlockResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkRegionBlockResponseUnmarshaller {

	public static DescribeNetworkRegionBlockResponse unmarshall(DescribeNetworkRegionBlockResponse describeNetworkRegionBlockResponse, UnmarshallerContext _ctx) {
		
		describeNetworkRegionBlockResponse.setRequestId(_ctx.stringValue("DescribeNetworkRegionBlockResponse.RequestId"));

		Config config = new Config();
		config.setRegionBlockSwitch(_ctx.stringValue("DescribeNetworkRegionBlockResponse.Config.RegionBlockSwitch"));

		List<String> countries = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkRegionBlockResponse.Config.Countries.Length"); i++) {
			countries.add(_ctx.stringValue("DescribeNetworkRegionBlockResponse.Config.Countries["+ i +"]"));
		}
		config.setCountries(countries);

		List<String> provinces = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkRegionBlockResponse.Config.Provinces.Length"); i++) {
			provinces.add(_ctx.stringValue("DescribeNetworkRegionBlockResponse.Config.Provinces["+ i +"]"));
		}
		config.setProvinces(provinces);
		describeNetworkRegionBlockResponse.setConfig(config);
	 
	 	return describeNetworkRegionBlockResponse;
	}
}