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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeTemplatesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeTemplatesResponse.Template;
import com.aliyuncs.vs.model.v20181212.DescribeTemplatesResponse.Template.TransConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesResponseUnmarshaller {

	public static DescribeTemplatesResponse unmarshall(DescribeTemplatesResponse describeTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeTemplatesResponse.setRequestId(_ctx.stringValue("DescribeTemplatesResponse.RequestId"));
		describeTemplatesResponse.setPageSize(_ctx.longValue("DescribeTemplatesResponse.PageSize"));
		describeTemplatesResponse.setPageNum(_ctx.longValue("DescribeTemplatesResponse.PageNum"));
		describeTemplatesResponse.setPageCount(_ctx.longValue("DescribeTemplatesResponse.PageCount"));
		describeTemplatesResponse.setTotalCount(_ctx.longValue("DescribeTemplatesResponse.TotalCount"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setId(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Id"));
			template.setName(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Name"));
			template.setDescription(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Description"));
			template.setType(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Type"));
			template.setRegion(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Region"));
			template.setOssBucket(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].OssBucket"));
			template.setOssEndpoint(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].OssEndpoint"));
			template.setOssFilePrefix(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].OssFilePrefix"));
			template.setTrigger(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Trigger"));
			template.setStartTime(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].StartTime"));
			template.setEndTime(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].EndTime"));
			template.setInterval(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].Interval"));
			template.setRetention(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].Retention"));
			template.setFileFormat(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].FileFormat"));
			template.setJpgOverwrite(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].JpgOverwrite"));
			template.setJpgSequence(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].JpgSequence"));
			template.setJpgOnDemand(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].JpgOnDemand"));
			template.setMp4(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Mp4"));
			template.setFlv(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Flv"));
			template.setHlsM3u8(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].HlsM3u8"));
			template.setHlsTs(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].HlsTs"));
			template.setCallback(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].Callback"));
			template.setCreatedTime(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].CreatedTime"));

			List<TransConfig> transConfigs = new ArrayList<TransConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs.Length"); j++) {
				TransConfig transConfig = new TransConfig();
				transConfig.setId(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].id"));
				transConfig.setName(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].Name"));
				transConfig.setVideoCodec(_ctx.stringValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].VideoCodec"));
				transConfig.setVideoBitrate(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].VideoBitrate"));
				transConfig.setFps(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].Fps"));
				transConfig.setGop(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].Gop"));
				transConfig.setHeight(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].Height"));
				transConfig.setWidth(_ctx.longValue("DescribeTemplatesResponse.Templates["+ i +"].TransConfigs["+ j +"].Width"));

				transConfigs.add(transConfig);
			}
			template.setTransConfigs(transConfigs);

			templates.add(template);
		}
		describeTemplatesResponse.setTemplates(templates);
	 
	 	return describeTemplatesResponse;
	}
}