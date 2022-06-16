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

package com.aliyuncs.dytnsapi.transform.v20200217;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberAnalysisResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberAnalysisResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberAnalysisResponseUnmarshaller {

	public static DescribePhoneNumberAnalysisResponse unmarshall(DescribePhoneNumberAnalysisResponse describePhoneNumberAnalysisResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberAnalysisResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.RequestId"));
		describePhoneNumberAnalysisResponse.setCode(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Code"));
		describePhoneNumberAnalysisResponse.setMessage(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Message"));

		List<DataList> data = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("DescribePhoneNumberAnalysisResponse.Data.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setCode(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Data["+ i +"].Code"));
			dataList.setNumber(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Data["+ i +"].Number"));

			data.add(dataList);
		}
		describePhoneNumberAnalysisResponse.setData(data);
	 
	 	return describePhoneNumberAnalysisResponse;
	}
}