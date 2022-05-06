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

package com.aliyuncs.educloud.transform.v20220202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.educloud.model.v20220202.DescribeLabResponse;
import com.aliyuncs.educloud.model.v20220202.DescribeLabResponse.Data;
import com.aliyuncs.educloud.model.v20220202.DescribeLabResponse.Data.ChapterItem;
import com.aliyuncs.educloud.model.v20220202.DescribeLabResponse.Data.ChapterItem.Section;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLabResponseUnmarshaller {

	public static DescribeLabResponse unmarshall(DescribeLabResponse describeLabResponse, UnmarshallerContext _ctx) {
		
		describeLabResponse.setRequestId(_ctx.stringValue("DescribeLabResponse.RequestId"));
		describeLabResponse.setSuccess(_ctx.booleanValue("DescribeLabResponse.Success"));
		describeLabResponse.setCode(_ctx.longValue("DescribeLabResponse.Code"));
		describeLabResponse.setMessage(_ctx.stringValue("DescribeLabResponse.Message"));

		Data data = new Data();
		data.setLabId(_ctx.stringValue("DescribeLabResponse.Data.LabId"));
		data.setTitle(_ctx.stringValue("DescribeLabResponse.Data.Title"));
		data.setIntroduce(_ctx.stringValue("DescribeLabResponse.Data.Introduce"));
		data.setTime(_ctx.stringValue("DescribeLabResponse.Data.Time"));
		data.setCategory(_ctx.stringValue("DescribeLabResponse.Data.Category"));
		data.setTag(_ctx.stringValue("DescribeLabResponse.Data.Tag"));

		List<ChapterItem> chapter = new ArrayList<ChapterItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLabResponse.Data.Chapter.Length"); i++) {
			ChapterItem chapterItem = new ChapterItem();
			chapterItem.setOrderNumber(_ctx.longValue("DescribeLabResponse.Data.Chapter["+ i +"].OrderNumber"));
			chapterItem.setTitle(_ctx.stringValue("DescribeLabResponse.Data.Chapter["+ i +"].Title"));

			List<Section> sections = new ArrayList<Section>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLabResponse.Data.Chapter["+ i +"].Sections.Length"); j++) {
				Section section = new Section();
				section.setSectionId(_ctx.stringValue("DescribeLabResponse.Data.Chapter["+ i +"].Sections["+ j +"].SectionId"));
				section.setTitle(_ctx.stringValue("DescribeLabResponse.Data.Chapter["+ i +"].Sections["+ j +"].Title"));
				section.setOrderNumber(_ctx.longValue("DescribeLabResponse.Data.Chapter["+ i +"].Sections["+ j +"].OrderNumber"));
				section.setContent(_ctx.stringValue("DescribeLabResponse.Data.Chapter["+ i +"].Sections["+ j +"].Content"));

				sections.add(section);
			}
			chapterItem.setSections(sections);

			chapter.add(chapterItem);
		}
		data.setChapter(chapter);
		describeLabResponse.setData(data);
	 
	 	return describeLabResponse;
	}
}