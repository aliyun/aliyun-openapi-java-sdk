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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllPrivacyAlgorithmResponse;
import com.aliyuncs.lto.model.v20210707.ListAllPrivacyAlgorithmResponse.AlgTypeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllPrivacyAlgorithmResponseUnmarshaller {

	public static ListAllPrivacyAlgorithmResponse unmarshall(ListAllPrivacyAlgorithmResponse listAllPrivacyAlgorithmResponse, UnmarshallerContext _ctx) {
		
		listAllPrivacyAlgorithmResponse.setRequestId(_ctx.stringValue("ListAllPrivacyAlgorithmResponse.RequestId"));
		listAllPrivacyAlgorithmResponse.setCode(_ctx.stringValue("ListAllPrivacyAlgorithmResponse.Code"));
		listAllPrivacyAlgorithmResponse.setHttpStatusCode(_ctx.integerValue("ListAllPrivacyAlgorithmResponse.HttpStatusCode"));
		listAllPrivacyAlgorithmResponse.setMessage(_ctx.stringValue("ListAllPrivacyAlgorithmResponse.Message"));
		listAllPrivacyAlgorithmResponse.setSuccess(_ctx.booleanValue("ListAllPrivacyAlgorithmResponse.Success"));

		List<AlgTypeInfo> data = new ArrayList<AlgTypeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllPrivacyAlgorithmResponse.Data.Length"); i++) {
			AlgTypeInfo algTypeInfo = new AlgTypeInfo();
			algTypeInfo.setAlgType(_ctx.stringValue("ListAllPrivacyAlgorithmResponse.Data["+ i +"].AlgType"));

			List<String> algImplList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAllPrivacyAlgorithmResponse.Data["+ i +"].AlgImplList.Length"); j++) {
				algImplList.add(_ctx.stringValue("ListAllPrivacyAlgorithmResponse.Data["+ i +"].AlgImplList["+ j +"]"));
			}
			algTypeInfo.setAlgImplList(algImplList);

			data.add(algTypeInfo);
		}
		listAllPrivacyAlgorithmResponse.setData(data);
	 
	 	return listAllPrivacyAlgorithmResponse;
	}
}