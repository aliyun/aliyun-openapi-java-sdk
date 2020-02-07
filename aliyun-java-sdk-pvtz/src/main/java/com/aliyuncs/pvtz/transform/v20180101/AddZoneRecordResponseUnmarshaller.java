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

package com.aliyuncs.pvtz.transform.v20180101;

import com.aliyuncs.pvtz.model.v20180101.AddZoneRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddZoneRecordResponseUnmarshaller {

	public static AddZoneRecordResponse unmarshall(AddZoneRecordResponse addZoneRecordResponse, UnmarshallerContext _ctx) {
		
		addZoneRecordResponse.setRequestId(_ctx.stringValue("AddZoneRecordResponse.RequestId"));
		addZoneRecordResponse.setSuccess(_ctx.booleanValue("AddZoneRecordResponse.Success"));
		addZoneRecordResponse.setRecordId(_ctx.longValue("AddZoneRecordResponse.RecordId"));
	 
	 	return addZoneRecordResponse;
	}
}