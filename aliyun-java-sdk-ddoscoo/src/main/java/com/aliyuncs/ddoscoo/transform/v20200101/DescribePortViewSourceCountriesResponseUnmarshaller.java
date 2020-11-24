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

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortViewSourceCountriesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortViewSourceCountriesResponse.Country;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortViewSourceCountriesResponseUnmarshaller {

	public static DescribePortViewSourceCountriesResponse unmarshall(DescribePortViewSourceCountriesResponse describePortViewSourceCountriesResponse, UnmarshallerContext _ctx) {
		
		describePortViewSourceCountriesResponse.setRequestId(_ctx.stringValue("DescribePortViewSourceCountriesResponse.RequestId"));

		List<Country> sourceCountrys = new ArrayList<Country>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortViewSourceCountriesResponse.SourceCountrys.Length"); i++) {
			Country country = new Country();
			country.setCount(_ctx.longValue("DescribePortViewSourceCountriesResponse.SourceCountrys["+ i +"].Count"));
			country.setCountryId(_ctx.stringValue("DescribePortViewSourceCountriesResponse.SourceCountrys["+ i +"].CountryId"));

			sourceCountrys.add(country);
		}
		describePortViewSourceCountriesResponse.setSourceCountrys(sourceCountrys);
	 
	 	return describePortViewSourceCountriesResponse;
	}
}