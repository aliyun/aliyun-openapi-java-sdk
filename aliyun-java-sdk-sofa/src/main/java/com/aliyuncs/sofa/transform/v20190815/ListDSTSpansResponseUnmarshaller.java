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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDSTSpansResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTSpansResponse.SpansItem;
import com.aliyuncs.sofa.model.v20190815.ListDSTSpansResponse.SpansItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTSpansResponseUnmarshaller {

	public static ListDSTSpansResponse unmarshall(ListDSTSpansResponse listDSTSpansResponse, UnmarshallerContext _ctx) {
		
		listDSTSpansResponse.setRequestId(_ctx.stringValue("ListDSTSpansResponse.RequestId"));
		listDSTSpansResponse.setResultCode(_ctx.stringValue("ListDSTSpansResponse.ResultCode"));
		listDSTSpansResponse.setResultMessage(_ctx.stringValue("ListDSTSpansResponse.ResultMessage"));
		listDSTSpansResponse.setPageNumber(_ctx.longValue("ListDSTSpansResponse.PageNumber"));
		listDSTSpansResponse.setPageSize(_ctx.longValue("ListDSTSpansResponse.PageSize"));
		listDSTSpansResponse.setTotalCount(_ctx.longValue("ListDSTSpansResponse.TotalCount"));

		List<SpansItem> spans = new ArrayList<SpansItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTSpansResponse.Spans.Length"); i++) {
			SpansItem spansItem = new SpansItem();
			spansItem.setBasicInfo(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].BasicInfo"));
			spansItem.setComponent(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].Component"));
			spansItem.setDuration(_ctx.longValue("ListDSTSpansResponse.Spans["+ i +"].Duration"));
			spansItem.setEnvInstanceId(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].EnvInstanceId"));
			spansItem.setKind(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].Kind"));
			spansItem.setLocalInfo(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].LocalInfo"));
			spansItem.setLocalIpv4(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].LocalIpv4"));
			spansItem.setLocalServiceName(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].LocalServiceName"));
			spansItem.setName(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].Name"));
			spansItem.setParentId(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].ParentId"));
			spansItem.setRemoteInfo(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].RemoteInfo"));
			spansItem.setRemoteIpv4(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].RemoteIpv4"));
			spansItem.setRemoteServiceName(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].RemoteServiceName"));
			spansItem.setResult(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].Result"));
			spansItem.setSpanId(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].SpanId"));
			spansItem.setStartTime(_ctx.longValue("ListDSTSpansResponse.Spans["+ i +"].StartTime"));
			spansItem.setTraceId(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].TraceId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDSTSpansResponse.Spans["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListDSTSpansResponse.Spans["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			spansItem.setTags(tags);

			spans.add(spansItem);
		}
		listDSTSpansResponse.setSpans(spans);
	 
	 	return listDSTSpansResponse;
	}
}