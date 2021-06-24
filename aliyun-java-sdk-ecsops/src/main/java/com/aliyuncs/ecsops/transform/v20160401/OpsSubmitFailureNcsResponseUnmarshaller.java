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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsSubmitFailureNcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSubmitFailureNcsResponseUnmarshaller {

	public static OpsSubmitFailureNcsResponse unmarshall(OpsSubmitFailureNcsResponse opsSubmitFailureNcsResponse, UnmarshallerContext _ctx) {
		
		opsSubmitFailureNcsResponse.setRequestId(_ctx.stringValue("OpsSubmitFailureNcsResponse.RequestId"));
		opsSubmitFailureNcsResponse.setStatus(_ctx.stringValue("OpsSubmitFailureNcsResponse.Status"));
		opsSubmitFailureNcsResponse.setFinished(_ctx.booleanValue("OpsSubmitFailureNcsResponse.Finished"));
		opsSubmitFailureNcsResponse.setErrorInfo(_ctx.stringValue("OpsSubmitFailureNcsResponse.ErrorInfo"));
		opsSubmitFailureNcsResponse.setToken(_ctx.stringValue("OpsSubmitFailureNcsResponse.Token"));

		List<String> insertedVmList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsSubmitFailureNcsResponse.InsertedVmList.Length"); i++) {
			insertedVmList.add(_ctx.stringValue("OpsSubmitFailureNcsResponse.InsertedVmList["+ i +"]"));
		}
		opsSubmitFailureNcsResponse.setInsertedVmList(insertedVmList);

		List<String> insertedNcList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsSubmitFailureNcsResponse.InsertedNcList.Length"); i++) {
			insertedNcList.add(_ctx.stringValue("OpsSubmitFailureNcsResponse.InsertedNcList["+ i +"]"));
		}
		opsSubmitFailureNcsResponse.setInsertedNcList(insertedNcList);
	 
	 	return opsSubmitFailureNcsResponse;
	}
}