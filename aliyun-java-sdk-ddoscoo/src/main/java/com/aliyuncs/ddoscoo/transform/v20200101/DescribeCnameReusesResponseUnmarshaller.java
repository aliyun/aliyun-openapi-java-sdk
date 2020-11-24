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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeCnameReusesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeCnameReusesResponse.CnameReuse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCnameReusesResponseUnmarshaller {

	public static DescribeCnameReusesResponse unmarshall(DescribeCnameReusesResponse describeCnameReusesResponse, UnmarshallerContext _ctx) {
		
		describeCnameReusesResponse.setRequestId(_ctx.stringValue("DescribeCnameReusesResponse.RequestId"));

		List<CnameReuse> cnameReuses = new ArrayList<CnameReuse>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCnameReusesResponse.CnameReuses.Length"); i++) {
			CnameReuse cnameReuse = new CnameReuse();
			cnameReuse.setDomain(_ctx.stringValue("DescribeCnameReusesResponse.CnameReuses["+ i +"].Domain"));
			cnameReuse.setEnable(_ctx.integerValue("DescribeCnameReusesResponse.CnameReuses["+ i +"].Enable"));
			cnameReuse.setCname(_ctx.stringValue("DescribeCnameReusesResponse.CnameReuses["+ i +"].Cname"));

			cnameReuses.add(cnameReuse);
		}
		describeCnameReusesResponse.setCnameReuses(cnameReuses);
	 
	 	return describeCnameReusesResponse;
	}
}