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

import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableResponse.PersonTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAiotPersonTableResponseUnmarshaller {

	public static UpdateAiotPersonTableResponse unmarshall(UpdateAiotPersonTableResponse updateAiotPersonTableResponse, UnmarshallerContext _ctx) {
		
		updateAiotPersonTableResponse.setRequestId(_ctx.stringValue("UpdateAiotPersonTableResponse.RequestId"));
		updateAiotPersonTableResponse.setMessage(_ctx.stringValue("UpdateAiotPersonTableResponse.Message"));
		updateAiotPersonTableResponse.setCode(_ctx.stringValue("UpdateAiotPersonTableResponse.Code"));

		PersonTable personTable = new PersonTable();
		personTable.setPersonTableId(_ctx.stringValue("UpdateAiotPersonTableResponse.PersonTable.PersonTableId"));
		personTable.setType(_ctx.longValue("UpdateAiotPersonTableResponse.PersonTable.Type"));
		personTable.setFaceNum(_ctx.longValue("UpdateAiotPersonTableResponse.PersonTable.FaceNum"));
		personTable.setDeviceId(_ctx.stringValue("UpdateAiotPersonTableResponse.PersonTable.DeviceId"));
		personTable.setLastChange(_ctx.stringValue("UpdateAiotPersonTableResponse.PersonTable.LastChange"));
		personTable.setTotalPersonNum(_ctx.longValue("UpdateAiotPersonTableResponse.PersonTable.TotalPersonNum"));
		personTable.setPersonNum(_ctx.longValue("UpdateAiotPersonTableResponse.PersonTable.PersonNum"));
		personTable.setName(_ctx.stringValue("UpdateAiotPersonTableResponse.PersonTable.Name"));

		List<Long> verificationModelList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAiotPersonTableResponse.PersonTable.VerificationModelList.Length"); i++) {
			verificationModelList.add(_ctx.longValue("UpdateAiotPersonTableResponse.PersonTable.VerificationModelList["+ i +"]"));
		}
		personTable.setVerificationModelList(verificationModelList);
		updateAiotPersonTableResponse.setPersonTable(personTable);
	 
	 	return updateAiotPersonTableResponse;
	}
}