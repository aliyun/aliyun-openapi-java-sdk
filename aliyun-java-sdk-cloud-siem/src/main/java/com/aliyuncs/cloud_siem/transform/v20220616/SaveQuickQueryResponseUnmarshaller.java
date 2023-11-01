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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.SaveQuickQueryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveQuickQueryResponseUnmarshaller {

	public static SaveQuickQueryResponse unmarshall(SaveQuickQueryResponse saveQuickQueryResponse, UnmarshallerContext _ctx) {
		
		saveQuickQueryResponse.setRequestId(_ctx.stringValue("SaveQuickQueryResponse.RequestId"));
		saveQuickQueryResponse.setData(_ctx.booleanValue("SaveQuickQueryResponse.Data"));
		saveQuickQueryResponse.setSuccess(_ctx.booleanValue("SaveQuickQueryResponse.Success"));
		saveQuickQueryResponse.setCode(_ctx.integerValue("SaveQuickQueryResponse.Code"));
		saveQuickQueryResponse.setMessage(_ctx.stringValue("SaveQuickQueryResponse.Message"));
		saveQuickQueryResponse.setErrCode(_ctx.stringValue("SaveQuickQueryResponse.ErrCode"));
		saveQuickQueryResponse.setDyCode(_ctx.stringValue("SaveQuickQueryResponse.DyCode"));
		saveQuickQueryResponse.setDyMessage(_ctx.stringValue("SaveQuickQueryResponse.DyMessage"));
	 
	 	return saveQuickQueryResponse;
	}
}