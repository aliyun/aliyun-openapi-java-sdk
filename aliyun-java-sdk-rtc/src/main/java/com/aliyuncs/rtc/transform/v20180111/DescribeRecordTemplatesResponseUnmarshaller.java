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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRecordTemplatesResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordTemplatesResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordTemplatesResponseUnmarshaller {

	public static DescribeRecordTemplatesResponse unmarshall(DescribeRecordTemplatesResponse describeRecordTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeRecordTemplatesResponse.setRequestId(_ctx.stringValue("DescribeRecordTemplatesResponse.RequestId"));
		describeRecordTemplatesResponse.setTotalNum(_ctx.longValue("DescribeRecordTemplatesResponse.TotalNum"));
		describeRecordTemplatesResponse.setTotalPage(_ctx.longValue("DescribeRecordTemplatesResponse.TotalPage"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setCreateTime(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].CreateTime"));
			template.setTemplateId(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setName(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Name"));
			template.setMediaEncode(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].MediaEncode"));
			template.setBackgroundColor(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].BackgroundColor"));
			template.setFileSplitInterval(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].FileSplitInterval"));
			template.setTaskProfile(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].TaskProfile"));
			template.setOssBucket(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].OssBucket"));
			template.setOssFilePrefix(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].OssFilePrefix"));
			template.setMnsQueue(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].MnsQueue"));

			List<Integer> layoutIds = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates["+ i +"].LayoutIds.Length"); j++) {
				layoutIds.add(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].LayoutIds["+ j +"]"));
			}
			template.setLayoutIds(layoutIds);

			List<String> formats = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Formats.Length"); j++) {
				formats.add(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Formats["+ j +"]"));
			}
			template.setFormats(formats);

			templates.add(template);
		}
		describeRecordTemplatesResponse.setTemplates(templates);
	 
	 	return describeRecordTemplatesResponse;
	}
}