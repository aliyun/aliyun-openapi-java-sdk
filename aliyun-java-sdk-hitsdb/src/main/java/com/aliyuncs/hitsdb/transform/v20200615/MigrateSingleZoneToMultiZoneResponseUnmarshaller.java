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

import com.aliyuncs.hitsdb.model.v20200615.MigrateSingleZoneToMultiZoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MigrateSingleZoneToMultiZoneResponseUnmarshaller {

	public static MigrateSingleZoneToMultiZoneResponse unmarshall(MigrateSingleZoneToMultiZoneResponse migrateSingleZoneToMultiZoneResponse, UnmarshallerContext _ctx) {
		
		migrateSingleZoneToMultiZoneResponse.setRequestId(_ctx.stringValue("MigrateSingleZoneToMultiZoneResponse.RequestId"));
		migrateSingleZoneToMultiZoneResponse.setAccessDeniedDetail(_ctx.stringValue("MigrateSingleZoneToMultiZoneResponse.AccessDeniedDetail"));
	 
	 	return migrateSingleZoneToMultiZoneResponse;
	}
}