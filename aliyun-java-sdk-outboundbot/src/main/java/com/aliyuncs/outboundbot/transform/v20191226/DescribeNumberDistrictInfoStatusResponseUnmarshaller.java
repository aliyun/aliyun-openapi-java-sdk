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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeNumberDistrictInfoStatusResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeNumberDistrictInfoStatusResponse.AppliedVersion;
import com.aliyuncs.outboundbot.model.v20191226.DescribeNumberDistrictInfoStatusResponse.ParsingVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNumberDistrictInfoStatusResponseUnmarshaller {

	public static DescribeNumberDistrictInfoStatusResponse unmarshall(DescribeNumberDistrictInfoStatusResponse describeNumberDistrictInfoStatusResponse, UnmarshallerContext _ctx) {
		
		describeNumberDistrictInfoStatusResponse.setRequestId(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.RequestId"));
		describeNumberDistrictInfoStatusResponse.setHttpStatusCode(_ctx.integerValue("DescribeNumberDistrictInfoStatusResponse.HttpStatusCode"));
		describeNumberDistrictInfoStatusResponse.setCode(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.Code"));
		describeNumberDistrictInfoStatusResponse.setMessage(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.Message"));
		describeNumberDistrictInfoStatusResponse.setSuccess(_ctx.booleanValue("DescribeNumberDistrictInfoStatusResponse.Success"));
		describeNumberDistrictInfoStatusResponse.setStatus(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.Status"));

		AppliedVersion appliedVersion = new AppliedVersion();
		appliedVersion.setVersionId(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.AppliedVersion.VersionId"));
		appliedVersion.setFileName(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.AppliedVersion.FileName"));
		appliedVersion.setFileSize(_ctx.longValue("DescribeNumberDistrictInfoStatusResponse.AppliedVersion.FileSize"));
		describeNumberDistrictInfoStatusResponse.setAppliedVersion(appliedVersion);

		ParsingVersion parsingVersion = new ParsingVersion();
		parsingVersion.setVersionId(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.ParsingVersion.VersionId"));
		parsingVersion.setFileName(_ctx.stringValue("DescribeNumberDistrictInfoStatusResponse.ParsingVersion.FileName"));
		parsingVersion.setFileSize(_ctx.longValue("DescribeNumberDistrictInfoStatusResponse.ParsingVersion.FileSize"));
		parsingVersion.setParseProgress(_ctx.longValue("DescribeNumberDistrictInfoStatusResponse.ParsingVersion.ParseProgress"));
		describeNumberDistrictInfoStatusResponse.setParsingVersion(parsingVersion);
	 
	 	return describeNumberDistrictInfoStatusResponse;
	}
}