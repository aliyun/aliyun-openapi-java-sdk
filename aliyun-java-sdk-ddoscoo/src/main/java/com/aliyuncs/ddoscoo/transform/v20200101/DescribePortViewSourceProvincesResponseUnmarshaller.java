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

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortViewSourceProvincesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortViewSourceProvincesResponse.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortViewSourceProvincesResponseUnmarshaller {

	public static DescribePortViewSourceProvincesResponse unmarshall(DescribePortViewSourceProvincesResponse describePortViewSourceProvincesResponse, UnmarshallerContext _ctx) {
		
		describePortViewSourceProvincesResponse.setRequestId(_ctx.stringValue("DescribePortViewSourceProvincesResponse.RequestId"));

		List<Province> sourceProvinces = new ArrayList<Province>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortViewSourceProvincesResponse.SourceProvinces.Length"); i++) {
			Province province = new Province();
			province.setCount(_ctx.longValue("DescribePortViewSourceProvincesResponse.SourceProvinces["+ i +"].Count"));
			province.setProvinceId(_ctx.stringValue("DescribePortViewSourceProvincesResponse.SourceProvinces["+ i +"].ProvinceId"));

			sourceProvinces.add(province);
		}
		describePortViewSourceProvincesResponse.setSourceProvinces(sourceProvinces);
	 
	 	return describePortViewSourceProvincesResponse;
	}
}