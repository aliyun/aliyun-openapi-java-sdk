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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.AdvanceSecurityEventOperationsResponse;
import com.aliyuncs.sas.model.v20181203.AdvanceSecurityEventOperationsResponse.SecurityEventOperation;
import com.aliyuncs.sas.model.v20181203.AdvanceSecurityEventOperationsResponse.SecurityEventOperation.MarkFieldItem;
import com.aliyuncs.sas.model.v20181203.AdvanceSecurityEventOperationsResponse.SecurityEventOperation.SecurityEventOperation1;
import com.aliyuncs.transform.UnmarshallerContext;


public class AdvanceSecurityEventOperationsResponseUnmarshaller {

	public static AdvanceSecurityEventOperationsResponse unmarshall(AdvanceSecurityEventOperationsResponse advanceSecurityEventOperationsResponse, UnmarshallerContext _ctx) {
		
		advanceSecurityEventOperationsResponse.setRequestId(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.RequestId"));

		List<SecurityEventOperation> securityEventOperationsResponse = new ArrayList<SecurityEventOperation>();
		for (int i = 0; i < _ctx.lengthValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse.Length"); i++) {
			SecurityEventOperation securityEventOperation = new SecurityEventOperation();
			securityEventOperation.setOperationParams(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].OperationParams"));
			securityEventOperation.setOperationCode(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].OperationCode"));
			securityEventOperation.setUserCanOperate(_ctx.booleanValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].UserCanOperate"));

			List<MarkFieldItem> markField = new ArrayList<MarkFieldItem>();
			for (int j = 0; j < _ctx.lengthValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField.Length"); j++) {
				MarkFieldItem markFieldItem = new MarkFieldItem();
				markFieldItem.setMarkMisType(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField["+ j +"].MarkMisType"));
				markFieldItem.setFiledName(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField["+ j +"].FiledName"));
				markFieldItem.setFiledAliasName(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField["+ j +"].FiledAliasName"));
				markFieldItem.setMarkMisValue(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField["+ j +"].MarkMisValue"));

				List<String> supportedMisType = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField["+ j +"].SupportedMisType.Length"); k++) {
					supportedMisType.add(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkField["+ j +"].SupportedMisType["+ k +"]"));
				}
				markFieldItem.setSupportedMisType(supportedMisType);

				markField.add(markFieldItem);
			}
			securityEventOperation.setMarkField(markField);

			List<SecurityEventOperation1> markFieldsSource = new ArrayList<SecurityEventOperation1>();
			for (int j = 0; j < _ctx.lengthValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkFieldsSource.Length"); j++) {
				SecurityEventOperation1 securityEventOperation1 = new SecurityEventOperation1();
				securityEventOperation1.setFiledName(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkFieldsSource["+ j +"].FiledName"));
				securityEventOperation1.setFiledAliasName(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkFieldsSource["+ j +"].FiledAliasName"));
				securityEventOperation1.setMarkMisValue(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkFieldsSource["+ j +"].MarkMisValue"));

				List<String> supportedMisType2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkFieldsSource["+ j +"].SupportedMisType.Length"); k++) {
					supportedMisType2.add(_ctx.stringValue("AdvanceSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].MarkFieldsSource["+ j +"].SupportedMisType["+ k +"]"));
				}
				securityEventOperation1.setSupportedMisType2(supportedMisType2);

				markFieldsSource.add(securityEventOperation1);
			}
			securityEventOperation.setMarkFieldsSource(markFieldsSource);

			securityEventOperationsResponse.add(securityEventOperation);
		}
		advanceSecurityEventOperationsResponse.setSecurityEventOperationsResponse(securityEventOperationsResponse);
	 
	 	return advanceSecurityEventOperationsResponse;
	}
}