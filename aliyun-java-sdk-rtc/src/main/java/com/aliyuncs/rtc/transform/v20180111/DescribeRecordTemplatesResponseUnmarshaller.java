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
import com.aliyuncs.rtc.model.v20180111.DescribeRecordTemplatesResponse.Template.Background;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordTemplatesResponse.Template.Watermark;
import com.aliyuncs.rtc.model.v20180111.DescribeRecordTemplatesResponse.Template.Watermark1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordTemplatesResponseUnmarshaller {

	public static DescribeRecordTemplatesResponse unmarshall(DescribeRecordTemplatesResponse describeRecordTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeRecordTemplatesResponse.setRequestId(_ctx.stringValue("DescribeRecordTemplatesResponse.RequestId"));
		describeRecordTemplatesResponse.setTotalPage(_ctx.longValue("DescribeRecordTemplatesResponse.TotalPage"));
		describeRecordTemplatesResponse.setTotalNum(_ctx.longValue("DescribeRecordTemplatesResponse.TotalNum"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setMnsQueue(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].MnsQueue"));
			template.setOssFilePrefix(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].OssFilePrefix"));
			template.setCreateTime(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].CreateTime"));
			template.setOssBucket(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].OssBucket"));
			template.setDelayStopTime(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].DelayStopTime"));
			template.setMediaEncode(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].MediaEncode"));
			template.setFileSplitInterval(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].FileSplitInterval"));
			template.setHttpCallbackUrl(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].HttpCallbackUrl"));
			template.setEnableM3u8DateTime(_ctx.booleanValue("DescribeRecordTemplatesResponse.Templates["+ i +"].EnableM3u8DateTime"));
			template.setBackgroundColor(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].BackgroundColor"));
			template.setName(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Name"));
			template.setTemplateId(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setTaskProfile(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].TaskProfile"));

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

			List<Background> backgrounds = new ArrayList<Background>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds.Length"); j++) {
				Background background = new Background();
				background.setWidth(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].Width"));
				background.setHeight(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].Height"));
				background.setY(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].Y"));
				background.setUrl(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].Url"));
				background.setDisplay(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].Display"));
				background.setZOrder(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].ZOrder"));
				background.setX(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Backgrounds["+ j +"].X"));

				backgrounds.add(background);
			}
			template.setBackgrounds(backgrounds);

			List<Watermark> watermarks = new ArrayList<Watermark>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks.Length"); j++) {
				Watermark watermark = new Watermark();
				watermark.setAlpha(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].Alpha"));
				watermark.setWidth(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].Width"));
				watermark.setHeight(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].Height"));
				watermark.setY(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].Y"));
				watermark.setUrl(_ctx.stringValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].Url"));
				watermark.setDisplay(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].Display"));
				watermark.setZOrder(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].ZOrder"));
				watermark.setX(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].Watermarks["+ j +"].X"));

				watermarks.add(watermark);
			}
			template.setWatermarks(watermarks);

			List<Watermark1> clockWidgets = new ArrayList<Watermark1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets.Length"); j++) {
				Watermark1 watermark1 = new Watermark1();
				watermark1.setFontType(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets["+ j +"].FontType"));
				watermark1.setFontColor(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets["+ j +"].FontColor"));
				watermark1.setY(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets["+ j +"].Y"));
				watermark1.setZOrder(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets["+ j +"].ZOrder"));
				watermark1.setX(_ctx.floatValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets["+ j +"].X"));
				watermark1.setFontSize(_ctx.integerValue("DescribeRecordTemplatesResponse.Templates["+ i +"].ClockWidgets["+ j +"].FontSize"));

				clockWidgets.add(watermark1);
			}
			template.setClockWidgets(clockWidgets);

			templates.add(template);
		}
		describeRecordTemplatesResponse.setTemplates(templates);
	 
	 	return describeRecordTemplatesResponse;
	}
}