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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.IndexVideoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IndexVideoResponseUnmarshaller {

	public static IndexVideoResponse unmarshall(IndexVideoResponse indexVideoResponse, UnmarshallerContext _ctx) {
		
		indexVideoResponse.setRequestId(_ctx.stringValue("IndexVideoResponse.RequestId"));
		indexVideoResponse.setModifyTime(_ctx.stringValue("IndexVideoResponse.ModifyTime"));
		indexVideoResponse.setEndTime(_ctx.stringValue("IndexVideoResponse.EndTime"));
		indexVideoResponse.setSaveType(_ctx.booleanValue("IndexVideoResponse.SaveType"));
		indexVideoResponse.setExternalId(_ctx.stringValue("IndexVideoResponse.ExternalId"));
		indexVideoResponse.setCreateTime(_ctx.stringValue("IndexVideoResponse.CreateTime"));
		indexVideoResponse.setStartTime(_ctx.stringValue("IndexVideoResponse.StartTime"));
		indexVideoResponse.setVideoUri(_ctx.stringValue("IndexVideoResponse.VideoUri"));
		indexVideoResponse.setGrabType(_ctx.stringValue("IndexVideoResponse.GrabType"));
		indexVideoResponse.setRemarksA(_ctx.stringValue("IndexVideoResponse.RemarksA"));
		indexVideoResponse.setRemarksB(_ctx.stringValue("IndexVideoResponse.RemarksB"));
		indexVideoResponse.setRemarksC(_ctx.stringValue("IndexVideoResponse.RemarksC"));
		indexVideoResponse.setTgtUri(_ctx.stringValue("IndexVideoResponse.TgtUri"));
		indexVideoResponse.setRemarksD(_ctx.stringValue("IndexVideoResponse.RemarksD"));
		indexVideoResponse.setSetId(_ctx.stringValue("IndexVideoResponse.SetId"));
		indexVideoResponse.setInterval(_ctx.floatValue("IndexVideoResponse.Interval"));
	 
	 	return indexVideoResponse;
	}
}