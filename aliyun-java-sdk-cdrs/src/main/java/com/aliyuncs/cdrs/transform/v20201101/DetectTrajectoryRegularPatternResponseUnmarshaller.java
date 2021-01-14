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

import com.aliyuncs.cdrs.model.v20201101.DetectTrajectoryRegularPatternResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectTrajectoryRegularPatternResponseUnmarshaller {

	public static DetectTrajectoryRegularPatternResponse unmarshall(DetectTrajectoryRegularPatternResponse detectTrajectoryRegularPatternResponse, UnmarshallerContext _ctx) {
		
		detectTrajectoryRegularPatternResponse.setRequestId(_ctx.stringValue("DetectTrajectoryRegularPatternResponse.RequestId"));
		detectTrajectoryRegularPatternResponse.setCode(_ctx.integerValue("DetectTrajectoryRegularPatternResponse.Code"));
		detectTrajectoryRegularPatternResponse.setData(_ctx.stringValue("DetectTrajectoryRegularPatternResponse.Data"));
		detectTrajectoryRegularPatternResponse.setMessage(_ctx.stringValue("DetectTrajectoryRegularPatternResponse.Message"));
		detectTrajectoryRegularPatternResponse.setSuccess(_ctx.booleanValue("DetectTrajectoryRegularPatternResponse.Success"));
	 
	 	return detectTrajectoryRegularPatternResponse;
	}
}