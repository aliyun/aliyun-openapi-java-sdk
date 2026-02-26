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

package com.aliyuncs.eds_aic.transform.v20230930;

import com.aliyuncs.eds_aic.model.v20230930.ImportKeyPairResponse;
import com.aliyuncs.eds_aic.model.v20230930.ImportKeyPairResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportKeyPairResponseUnmarshaller {

	public static ImportKeyPairResponse unmarshall(ImportKeyPairResponse importKeyPairResponse, UnmarshallerContext _ctx) {
		
		importKeyPairResponse.setRequestId(_ctx.stringValue("ImportKeyPairResponse.RequestId"));

		Data data = new Data();
		data.setKeyPairId(_ctx.stringValue("ImportKeyPairResponse.Data.KeyPairId"));
		data.setKeyPairName(_ctx.stringValue("ImportKeyPairResponse.Data.KeyPairName"));
		data.setGmtCreated(_ctx.stringValue("ImportKeyPairResponse.Data.GmtCreated"));
		importKeyPairResponse.setData(data);
	 
	 	return importKeyPairResponse;
	}
}