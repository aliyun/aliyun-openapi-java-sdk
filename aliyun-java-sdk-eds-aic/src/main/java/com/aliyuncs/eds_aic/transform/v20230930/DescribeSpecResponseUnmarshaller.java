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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeSpecResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeSpecResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpecResponseUnmarshaller {

	public static DescribeSpecResponse unmarshall(DescribeSpecResponse describeSpecResponse, UnmarshallerContext _ctx) {
		
		describeSpecResponse.setRequestId(_ctx.stringValue("DescribeSpecResponse.RequestId"));
		describeSpecResponse.setTotalCount(_ctx.integerValue("DescribeSpecResponse.TotalCount"));
		describeSpecResponse.setNextToken(_ctx.stringValue("DescribeSpecResponse.NextToken"));

		List<Data> specInfoModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSpecResponse.SpecInfoModel.Length"); i++) {
			Data data = new Data();
			data.setSpecId(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].SpecId"));
			data.setCore(_ctx.integerValue("DescribeSpecResponse.SpecInfoModel["+ i +"].Core"));
			data.setMemory(_ctx.integerValue("DescribeSpecResponse.SpecInfoModel["+ i +"].Memory"));
			data.setSystemDiskSize(_ctx.integerValue("DescribeSpecResponse.SpecInfoModel["+ i +"].SystemDiskSize"));
			data.setSpecType(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].SpecType"));
			data.setSpecStatus(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].SpecStatus"));
			data.setPhoneCount(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].PhoneCount"));
			data.setResolution(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].Resolution"));
			data.setMaxPhoneCount(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].MaxPhoneCount"));
			data.setMinPhoneCount(_ctx.stringValue("DescribeSpecResponse.SpecInfoModel["+ i +"].MinPhoneCount"));

			specInfoModel.add(data);
		}
		describeSpecResponse.setSpecInfoModel(specInfoModel);
	 
	 	return describeSpecResponse;
	}
}