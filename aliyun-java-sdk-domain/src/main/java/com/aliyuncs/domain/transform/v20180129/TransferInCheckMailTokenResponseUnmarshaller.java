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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.TransferInCheckMailTokenResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferInCheckMailTokenResponseUnmarshaller {

	public static TransferInCheckMailTokenResponse unmarshall(TransferInCheckMailTokenResponse transferInCheckMailTokenResponse, UnmarshallerContext context) {
		
		transferInCheckMailTokenResponse.setRequestId(context.stringValue("TransferInCheckMailTokenResponse.RequestId"));

		List<String> successList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("TransferInCheckMailTokenResponse.SuccessList.Length"); i++) {
			successList.add(context.stringValue("TransferInCheckMailTokenResponse.SuccessList["+ i +"]"));
		}
		transferInCheckMailTokenResponse.setSuccessList(successList);

		List<String> failList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("TransferInCheckMailTokenResponse.FailList.Length"); i++) {
			failList.add(context.stringValue("TransferInCheckMailTokenResponse.FailList["+ i +"]"));
		}
		transferInCheckMailTokenResponse.setFailList(failList);
	 
	 	return transferInCheckMailTokenResponse;
	}
}