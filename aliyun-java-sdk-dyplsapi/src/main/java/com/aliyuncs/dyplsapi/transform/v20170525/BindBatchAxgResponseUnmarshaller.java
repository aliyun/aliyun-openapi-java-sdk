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

package com.aliyuncs.dyplsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.BindBatchAxgResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindBatchAxgResponse.SecretBind;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindBatchAxgResponseUnmarshaller {

	public static BindBatchAxgResponse unmarshall(BindBatchAxgResponse bindBatchAxgResponse, UnmarshallerContext _ctx) {
		
		bindBatchAxgResponse.setRequestId(_ctx.stringValue("BindBatchAxgResponse.RequestId"));
		bindBatchAxgResponse.setCode(_ctx.stringValue("BindBatchAxgResponse.Code"));
		bindBatchAxgResponse.setMessage(_ctx.stringValue("BindBatchAxgResponse.Message"));

		List<SecretBind> secretBindList = new ArrayList<SecretBind>();
		for (int i = 0; i < _ctx.lengthValue("BindBatchAxgResponse.SecretBindList.Length"); i++) {
			SecretBind secretBind = new SecretBind();
			secretBind.setSecretNo(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].SecretNo"));
			secretBind.setSubsId(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].SubsId"));
			secretBind.setExtension(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].Extension"));
			secretBind.setGroupId(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].GroupId"));
			secretBind.setPhoneNoA(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].PhoneNoA"));
			secretBind.setCode(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].Code"));
			secretBind.setMessage(_ctx.stringValue("BindBatchAxgResponse.SecretBindList["+ i +"].Message"));

			secretBindList.add(secretBind);
		}
		bindBatchAxgResponse.setSecretBindList(secretBindList);
	 
	 	return bindBatchAxgResponse;
	}
}