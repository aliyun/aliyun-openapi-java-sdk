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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeProjectAttachmentsResponse;
import com.aliyuncs.market.model.v20151101.DescribeProjectAttachmentsResponse.ProjectAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectAttachmentsResponseUnmarshaller {

	public static DescribeProjectAttachmentsResponse unmarshall(DescribeProjectAttachmentsResponse describeProjectAttachmentsResponse, UnmarshallerContext _ctx) {
		
		describeProjectAttachmentsResponse.setRequestId(_ctx.stringValue("DescribeProjectAttachmentsResponse.RequestId"));
		describeProjectAttachmentsResponse.setSuccess(_ctx.booleanValue("DescribeProjectAttachmentsResponse.Success"));

		List<ProjectAttachment> result = new ArrayList<ProjectAttachment>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProjectAttachmentsResponse.Result.Length"); i++) {
			ProjectAttachment projectAttachment = new ProjectAttachment();
			projectAttachment.setStepNo(_ctx.integerValue("DescribeProjectAttachmentsResponse.Result["+ i +"].StepNo"));
			projectAttachment.setNodeId(_ctx.longValue("DescribeProjectAttachmentsResponse.Result["+ i +"].NodeId"));
			projectAttachment.setNodeName(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].NodeName"));
			projectAttachment.setAttachmentType(_ctx.integerValue("DescribeProjectAttachmentsResponse.Result["+ i +"].AttachmentType"));
			projectAttachment.setFileName(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].FileName"));
			projectAttachment.setFileSuffix(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].FileSuffix"));
			projectAttachment.setFileSize(_ctx.longValue("DescribeProjectAttachmentsResponse.Result["+ i +"].FileSize"));
			projectAttachment.setOperatorRole(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].OperatorRole"));
			projectAttachment.setOperator(_ctx.longValue("DescribeProjectAttachmentsResponse.Result["+ i +"].Operator"));
			projectAttachment.setOperatorName(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].OperatorName"));
			projectAttachment.setFileLink(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].FileLink"));
			projectAttachment.setFileLinkGmtExpired(_ctx.longValue("DescribeProjectAttachmentsResponse.Result["+ i +"].FileLinkGmtExpired"));
			projectAttachment.setContent(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].Content"));
			projectAttachment.setGmtCreate(_ctx.longValue("DescribeProjectAttachmentsResponse.Result["+ i +"].GmtCreate"));
			projectAttachment.setAttachmentToken(_ctx.stringValue("DescribeProjectAttachmentsResponse.Result["+ i +"].AttachmentToken"));

			result.add(projectAttachment);
		}
		describeProjectAttachmentsResponse.setResult(result);
	 
	 	return describeProjectAttachmentsResponse;
	}
}