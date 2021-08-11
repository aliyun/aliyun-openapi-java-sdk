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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTablesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTablesResponse.PersonTableType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAiotPersonTablesResponseUnmarshaller {

	public static DescribeAiotPersonTablesResponse unmarshall(DescribeAiotPersonTablesResponse describeAiotPersonTablesResponse, UnmarshallerContext _ctx) {
		
		describeAiotPersonTablesResponse.setRequestId(_ctx.stringValue("DescribeAiotPersonTablesResponse.RequestId"));
		describeAiotPersonTablesResponse.setMessage(_ctx.stringValue("DescribeAiotPersonTablesResponse.Message"));
		describeAiotPersonTablesResponse.setCode(_ctx.stringValue("DescribeAiotPersonTablesResponse.Code"));

		List<PersonTableType> personTableList = new ArrayList<PersonTableType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAiotPersonTablesResponse.PersonTableList.Length"); i++) {
			PersonTableType personTableType = new PersonTableType();
			personTableType.setPersonTableId(_ctx.stringValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].PersonTableId"));
			personTableType.setName(_ctx.stringValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].Name"));
			personTableType.setType(_ctx.longValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].Type"));
			personTableType.setTotalPersonNum(_ctx.longValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].TotalPersonNum"));
			personTableType.setPersonNum(_ctx.longValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].PersonNum"));
			personTableType.setFaceNum(_ctx.longValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].FaceNum"));
			personTableType.setLastChange(_ctx.stringValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].LastChange"));
			personTableType.setDeviceId(_ctx.stringValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].DeviceId"));

			List<Long> verificationModelList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].VerificationModelList.Length"); j++) {
				verificationModelList.add(_ctx.longValue("DescribeAiotPersonTablesResponse.PersonTableList["+ i +"].VerificationModelList["+ j +"]"));
			}
			personTableType.setVerificationModelList(verificationModelList);

			personTableList.add(personTableType);
		}
		describeAiotPersonTablesResponse.setPersonTableList(personTableList);
	 
	 	return describeAiotPersonTablesResponse;
	}
}