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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.ListModelVersionsByPageResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelVersionsByPageResponseUnmarshaller {

	public static ListModelVersionsByPageResponse unmarshall(ListModelVersionsByPageResponse listModelVersionsByPageResponse, UnmarshallerContext _ctx) {
		
		listModelVersionsByPageResponse.setRequestId(_ctx.stringValue("ListModelVersionsByPageResponse.RequestId"));
		listModelVersionsByPageResponse.setSuccess(_ctx.booleanValue("ListModelVersionsByPageResponse.Success"));
		listModelVersionsByPageResponse.setCode(_ctx.stringValue("ListModelVersionsByPageResponse.Code"));
		listModelVersionsByPageResponse.setErrorMessage(_ctx.stringValue("ListModelVersionsByPageResponse.ErrorMessage"));
		listModelVersionsByPageResponse.setData(_ctx.mapValue("ListModelVersionsByPageResponse.Data"));
	 
	 	return listModelVersionsByPageResponse;
	}
}