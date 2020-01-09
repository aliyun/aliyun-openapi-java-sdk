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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsNetDistrictResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsNetDistrictResponse.EnsNetDistrict;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsNetDistrictResponseUnmarshaller {

	public static DescribeEnsNetDistrictResponse unmarshall(DescribeEnsNetDistrictResponse describeEnsNetDistrictResponse, UnmarshallerContext _ctx) {
		
		describeEnsNetDistrictResponse.setRequestId(_ctx.stringValue("DescribeEnsNetDistrictResponse.RequestId"));
		describeEnsNetDistrictResponse.setCode(_ctx.integerValue("DescribeEnsNetDistrictResponse.Code"));

		List<EnsNetDistrict> ensNetDistricts = new ArrayList<EnsNetDistrict>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsNetDistrictResponse.EnsNetDistricts.Length"); i++) {
			EnsNetDistrict ensNetDistrict = new EnsNetDistrict();
			ensNetDistrict.setNetDistrictCode(_ctx.stringValue("DescribeEnsNetDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictCode"));
			ensNetDistrict.setNetDistrictName(_ctx.stringValue("DescribeEnsNetDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictName"));
			ensNetDistrict.setNetDistrictFatherCode(_ctx.stringValue("DescribeEnsNetDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictFatherCode"));
			ensNetDistrict.setEnsRegionIdCount(_ctx.stringValue("DescribeEnsNetDistrictResponse.EnsNetDistricts["+ i +"].EnsRegionIdCount"));
			ensNetDistrict.setNetDistrictLevel(_ctx.stringValue("DescribeEnsNetDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictLevel"));
			ensNetDistrict.setNetDistrictEnName(_ctx.stringValue("DescribeEnsNetDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictEnName"));

			ensNetDistricts.add(ensNetDistrict);
		}
		describeEnsNetDistrictResponse.setEnsNetDistricts(ensNetDistricts);
	 
	 	return describeEnsNetDistrictResponse;
	}
}