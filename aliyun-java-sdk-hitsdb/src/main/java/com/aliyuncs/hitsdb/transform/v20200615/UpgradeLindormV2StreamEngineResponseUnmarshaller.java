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

package com.aliyuncs.hitsdb.transform.v20200615;

import com.aliyuncs.hitsdb.model.v20200615.UpgradeLindormV2StreamEngineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeLindormV2StreamEngineResponseUnmarshaller {

	public static UpgradeLindormV2StreamEngineResponse unmarshall(UpgradeLindormV2StreamEngineResponse upgradeLindormV2StreamEngineResponse, UnmarshallerContext _ctx) {
		
		upgradeLindormV2StreamEngineResponse.setRequestId(_ctx.stringValue("UpgradeLindormV2StreamEngineResponse.RequestId"));
		upgradeLindormV2StreamEngineResponse.setAccessDeniedDetail(_ctx.stringValue("UpgradeLindormV2StreamEngineResponse.AccessDeniedDetail"));
	 
	 	return upgradeLindormV2StreamEngineResponse;
	}
}