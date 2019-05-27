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

	public static IndexVideoResponse unmarshall(IndexVideoResponse indexVideoResponse, UnmarshallerContext context) {
		
		indexVideoResponse.setRequestId(context.stringValue("IndexVideoResponse.RequestId"));
		indexVideoResponse.setSetId(context.stringValue("IndexVideoResponse.SetId"));
		indexVideoResponse.setVideoUri(context.stringValue("IndexVideoResponse.VideoUri"));
		indexVideoResponse.setRemarksA(context.stringValue("IndexVideoResponse.RemarksA"));
		indexVideoResponse.setRemarksB(context.stringValue("IndexVideoResponse.RemarksB"));
		indexVideoResponse.setCreateTime(context.stringValue("IndexVideoResponse.CreateTime"));
		indexVideoResponse.setModifyTime(context.stringValue("IndexVideoResponse.ModifyTime"));
		indexVideoResponse.setInterval(context.floatValue("IndexVideoResponse.Interval"));
		indexVideoResponse.setGrabType(context.stringValue("IndexVideoResponse.GrabType"));
		indexVideoResponse.setStartTime(context.stringValue("IndexVideoResponse.StartTime"));
		indexVideoResponse.setEndTime(context.stringValue("IndexVideoResponse.EndTime"));
		indexVideoResponse.setSaveType(context.booleanValue("IndexVideoResponse.SaveType"));
		indexVideoResponse.setTgtUri(context.stringValue("IndexVideoResponse.TgtUri"));
		indexVideoResponse.setRemarksC(context.stringValue("IndexVideoResponse.RemarksC"));
		indexVideoResponse.setRemarksD(context.stringValue("IndexVideoResponse.RemarksD"));
		indexVideoResponse.setExternalId(context.stringValue("IndexVideoResponse.ExternalId"));
	 
	 	return indexVideoResponse;
	}
}