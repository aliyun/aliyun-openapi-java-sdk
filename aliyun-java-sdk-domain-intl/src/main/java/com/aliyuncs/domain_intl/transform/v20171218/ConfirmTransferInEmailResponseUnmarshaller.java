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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.ConfirmTransferInEmailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmTransferInEmailResponseUnmarshaller {

	public static ConfirmTransferInEmailResponse unmarshall(ConfirmTransferInEmailResponse confirmTransferInEmailResponse, UnmarshallerContext context) {
		
		confirmTransferInEmailResponse.setRequestId(context.stringValue("ConfirmTransferInEmailResponse.RequestId"));

		List<String> successList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ConfirmTransferInEmailResponse.SuccessList.Length"); i++) {
			successList.add(context.stringValue("ConfirmTransferInEmailResponse.SuccessList["+ i +"]"));
		}
		confirmTransferInEmailResponse.setSuccessList(successList);

		List<String> failList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ConfirmTransferInEmailResponse.FailList.Length"); i++) {
			failList.add(context.stringValue("ConfirmTransferInEmailResponse.FailList["+ i +"]"));
		}
		confirmTransferInEmailResponse.setFailList(failList);
	 
	 	return confirmTransferInEmailResponse;
	}
}