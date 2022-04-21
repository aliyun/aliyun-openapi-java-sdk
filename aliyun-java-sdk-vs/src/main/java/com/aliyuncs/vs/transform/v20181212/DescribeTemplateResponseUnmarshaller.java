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

import com.aliyuncs.vs.model.v20181212.DescribeTemplateResponse;
import com.aliyuncs.vs.model.v20181212.DescribeTemplateResponse.TransConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplateResponseUnmarshaller {

	public static DescribeTemplateResponse unmarshall(DescribeTemplateResponse describeTemplateResponse, UnmarshallerContext _ctx) {
		
		describeTemplateResponse.setRequestId(_ctx.stringValue("DescribeTemplateResponse.RequestId"));
		describeTemplateResponse.setType(_ctx.stringValue("DescribeTemplateResponse.Type"));
		describeTemplateResponse.setTrigger(_ctx.stringValue("DescribeTemplateResponse.Trigger"));
		describeTemplateResponse.setHlsTs(_ctx.stringValue("DescribeTemplateResponse.HlsTs"));
		describeTemplateResponse.setMp4(_ctx.stringValue("DescribeTemplateResponse.Mp4"));
		describeTemplateResponse.setJpgOverwrite(_ctx.stringValue("DescribeTemplateResponse.JpgOverwrite"));
		describeTemplateResponse.setCallback(_ctx.stringValue("DescribeTemplateResponse.Callback"));
		describeTemplateResponse.setDescription(_ctx.stringValue("DescribeTemplateResponse.Description"));
		describeTemplateResponse.setRegion(_ctx.stringValue("DescribeTemplateResponse.Region"));
		describeTemplateResponse.setRetention(_ctx.longValue("DescribeTemplateResponse.Retention"));
		describeTemplateResponse.setHlsM3u8(_ctx.stringValue("DescribeTemplateResponse.HlsM3u8"));
		describeTemplateResponse.setName(_ctx.stringValue("DescribeTemplateResponse.Name"));
		describeTemplateResponse.setFlv(_ctx.stringValue("DescribeTemplateResponse.Flv"));
		describeTemplateResponse.setCreatedTime(_ctx.stringValue("DescribeTemplateResponse.CreatedTime"));
		describeTemplateResponse.setOssEndpoint(_ctx.stringValue("DescribeTemplateResponse.OssEndpoint"));
		describeTemplateResponse.setOssFilePrefix(_ctx.stringValue("DescribeTemplateResponse.OssFilePrefix"));
		describeTemplateResponse.setJpgOnDemand(_ctx.stringValue("DescribeTemplateResponse.JpgOnDemand"));
		describeTemplateResponse.setOssBucket(_ctx.stringValue("DescribeTemplateResponse.OssBucket"));
		describeTemplateResponse.setFileFormat(_ctx.stringValue("DescribeTemplateResponse.FileFormat"));
		describeTemplateResponse.setJpgSequence(_ctx.stringValue("DescribeTemplateResponse.JpgSequence"));
		describeTemplateResponse.setEndTime(_ctx.stringValue("DescribeTemplateResponse.EndTime"));
		describeTemplateResponse.setStartTime(_ctx.stringValue("DescribeTemplateResponse.StartTime"));
		describeTemplateResponse.setInterval(_ctx.longValue("DescribeTemplateResponse.Interval"));
		describeTemplateResponse.setId(_ctx.stringValue("DescribeTemplateResponse.Id"));

		List<TransConfig> transConfigs = new ArrayList<TransConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplateResponse.TransConfigs.Length"); i++) {
			TransConfig transConfig = new TransConfig();
			transConfig.setGop(_ctx.longValue("DescribeTemplateResponse.TransConfigs["+ i +"].Gop"));
			transConfig.setWidth(_ctx.longValue("DescribeTemplateResponse.TransConfigs["+ i +"].Width"));
			transConfig.setVideoBitrate(_ctx.longValue("DescribeTemplateResponse.TransConfigs["+ i +"].VideoBitrate"));
			transConfig.setHeight(_ctx.longValue("DescribeTemplateResponse.TransConfigs["+ i +"].Height"));
			transConfig.setVideoCodec(_ctx.stringValue("DescribeTemplateResponse.TransConfigs["+ i +"].VideoCodec"));
			transConfig.setFps(_ctx.longValue("DescribeTemplateResponse.TransConfigs["+ i +"].Fps"));
			transConfig.setName(_ctx.stringValue("DescribeTemplateResponse.TransConfigs["+ i +"].Name"));
			transConfig.setId(_ctx.stringValue("DescribeTemplateResponse.TransConfigs["+ i +"].Id"));

			transConfigs.add(transConfig);
		}
		describeTemplateResponse.setTransConfigs(transConfigs);
	 
	 	return describeTemplateResponse;
	}
}