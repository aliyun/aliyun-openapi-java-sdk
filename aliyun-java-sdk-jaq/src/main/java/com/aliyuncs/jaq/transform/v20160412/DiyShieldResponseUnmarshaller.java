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

package com.aliyuncs.jaq.transform.v20160412;

import com.aliyuncs.jaq.model.v20160412.DiyShieldResponse;
import com.aliyuncs.jaq.model.v20160412.DiyShieldResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DiyShieldResponseUnmarshaller {

	public static DiyShieldResponse unmarshall(DiyShieldResponse diyShieldResponse, UnmarshallerContext context) {
		
		diyShieldResponse.setErrorCode(context.integerValue("DiyShieldResponse.ErrorCode"));
		diyShieldResponse.setErrorMsg(context.stringValue("DiyShieldResponse.ErrorMsg"));

		Data data = new Data();
		data.setItemId(context.stringValue("DiyShieldResponse.Data.ItemId"));
		data.setProgress(context.integerValue("DiyShieldResponse.Data.Progress"));
		diyShieldResponse.setData(data);
	 
	 	return diyShieldResponse;
	}
}