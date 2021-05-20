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

import com.aliyuncs.ens.model.v20171110.DescribeEnsNetSaleDistrictResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsNetSaleDistrictResponse.EnsNetDistrict;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsNetSaleDistrictResponseUnmarshaller {

	public static DescribeEnsNetSaleDistrictResponse unmarshall(DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrictResponse, UnmarshallerContext _ctx) {
		
		describeEnsNetSaleDistrictResponse.setRequestId(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.RequestId"));
		describeEnsNetSaleDistrictResponse.setCode(_ctx.integerValue("DescribeEnsNetSaleDistrictResponse.Code"));

		List<EnsNetDistrict> ensNetDistricts = new ArrayList<EnsNetDistrict>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts.Length"); i++) {
			EnsNetDistrict ensNetDistrict = new EnsNetDistrict();
			ensNetDistrict.setEnsRegionIdCount(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].EnsRegionIdCount"));
			ensNetDistrict.setInstanceCount(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].InstanceCount"));
			ensNetDistrict.setNetDistrictCode(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictCode"));
			ensNetDistrict.setNetDistrictEnName(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictEnName"));
			ensNetDistrict.setNetDistrictFatherCode(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictFatherCode"));
			ensNetDistrict.setNetDistrictLevel(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictLevel"));
			ensNetDistrict.setNetDistrictName(_ctx.stringValue("DescribeEnsNetSaleDistrictResponse.EnsNetDistricts["+ i +"].NetDistrictName"));

			ensNetDistricts.add(ensNetDistrict);
		}
		describeEnsNetSaleDistrictResponse.setEnsNetDistricts(ensNetDistricts);
	 
	 	return describeEnsNetSaleDistrictResponse;
	}
}