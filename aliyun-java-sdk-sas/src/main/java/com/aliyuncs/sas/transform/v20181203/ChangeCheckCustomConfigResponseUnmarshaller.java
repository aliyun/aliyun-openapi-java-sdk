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

import com.aliyuncs.sas.model.v20181203.ChangeCheckCustomConfigResponse;
import com.aliyuncs.sas.model.v20181203.ChangeCheckCustomConfigResponse.IllegalCustomConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeCheckCustomConfigResponseUnmarshaller {

	public static ChangeCheckCustomConfigResponse unmarshall(ChangeCheckCustomConfigResponse changeCheckCustomConfigResponse, UnmarshallerContext _ctx) {
		
		changeCheckCustomConfigResponse.setRequestId(_ctx.stringValue("ChangeCheckCustomConfigResponse.RequestId"));

		List<IllegalCustomConfigsItem> illegalCustomConfigs = new ArrayList<IllegalCustomConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("ChangeCheckCustomConfigResponse.IllegalCustomConfigs.Length"); i++) {
			IllegalCustomConfigsItem illegalCustomConfigsItem = new IllegalCustomConfigsItem();
			illegalCustomConfigsItem.setName(_ctx.stringValue("ChangeCheckCustomConfigResponse.IllegalCustomConfigs["+ i +"].Name"));

			illegalCustomConfigs.add(illegalCustomConfigsItem);
		}
		changeCheckCustomConfigResponse.setIllegalCustomConfigs(illegalCustomConfigs);
	 
	 	return changeCheckCustomConfigResponse;
	}
}