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

package com.aliyuncs.imageprocess.transform.v20200320;

import com.aliyuncs.imageprocess.model.v20200320.TranslateMedResponse;
import com.aliyuncs.imageprocess.model.v20200320.TranslateMedResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TranslateMedResponseUnmarshaller {

	public static TranslateMedResponse unmarshall(TranslateMedResponse translateMedResponse, UnmarshallerContext _ctx) {
		
		translateMedResponse.setRequestId(_ctx.stringValue("TranslateMedResponse.RequestId"));

		Data data = new Data();
		data.setText(_ctx.stringValue("TranslateMedResponse.Data.Text"));
		data.setWords(_ctx.longValue("TranslateMedResponse.Data.Words"));
		translateMedResponse.setData(data);
	 
	 	return translateMedResponse;
	}
}