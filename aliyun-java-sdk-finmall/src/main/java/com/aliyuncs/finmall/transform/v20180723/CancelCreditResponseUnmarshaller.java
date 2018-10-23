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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.CancelCreditResponse;
import com.aliyuncs.finmall.model.v20180723.CancelCreditResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelCreditResponseUnmarshaller {

	public static CancelCreditResponse unmarshall(CancelCreditResponse cancelCreditResponse, UnmarshallerContext context) {
		
		cancelCreditResponse.setRequestId(context.stringValue("CancelCreditResponse.RequestId"));
		cancelCreditResponse.setCode(context.stringValue("CancelCreditResponse.Code"));
		cancelCreditResponse.setMessage(context.stringValue("CancelCreditResponse.Message"));

		Data data = new Data();
		data.setReturnCode(context.stringValue("CancelCreditResponse.Data.ReturnCode"));
		data.setCreditId(context.stringValue("CancelCreditResponse.Data.CreditId"));
		cancelCreditResponse.setData(data);
	 
	 	return cancelCreditResponse;
	}
}