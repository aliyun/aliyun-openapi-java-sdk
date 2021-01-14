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

package com.aliyuncs.cdrs.transform.v20201101;

import com.aliyuncs.cdrs.model.v20201101.RecallTrajectoryByCoordinateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecallTrajectoryByCoordinateResponseUnmarshaller {

	public static RecallTrajectoryByCoordinateResponse unmarshall(RecallTrajectoryByCoordinateResponse recallTrajectoryByCoordinateResponse, UnmarshallerContext _ctx) {
		
		recallTrajectoryByCoordinateResponse.setRequestId(_ctx.stringValue("RecallTrajectoryByCoordinateResponse.RequestId"));
		recallTrajectoryByCoordinateResponse.setCode(_ctx.integerValue("RecallTrajectoryByCoordinateResponse.Code"));
		recallTrajectoryByCoordinateResponse.setData(_ctx.stringValue("RecallTrajectoryByCoordinateResponse.Data"));
		recallTrajectoryByCoordinateResponse.setMessage(_ctx.stringValue("RecallTrajectoryByCoordinateResponse.Message"));
		recallTrajectoryByCoordinateResponse.setSuccess(_ctx.booleanValue("RecallTrajectoryByCoordinateResponse.Success"));
	 
	 	return recallTrajectoryByCoordinateResponse;
	}
}