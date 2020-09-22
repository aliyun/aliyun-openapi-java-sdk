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

import com.aliyuncs.rtc.model.v20180111.DescribeMPULayoutInfoListResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeMPULayoutInfoListResponse.Layout;
import com.aliyuncs.rtc.model.v20180111.DescribeMPULayoutInfoListResponse.Layout.PanesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMPULayoutInfoListResponseUnmarshaller {

	public static DescribeMPULayoutInfoListResponse unmarshall(DescribeMPULayoutInfoListResponse describeMPULayoutInfoListResponse, UnmarshallerContext _ctx) {
		
		describeMPULayoutInfoListResponse.setRequestId(_ctx.stringValue("DescribeMPULayoutInfoListResponse.RequestId"));
		describeMPULayoutInfoListResponse.setTotalNum(_ctx.longValue("DescribeMPULayoutInfoListResponse.TotalNum"));
		describeMPULayoutInfoListResponse.setTotalPage(_ctx.longValue("DescribeMPULayoutInfoListResponse.TotalPage"));

		List<Layout> layouts = new ArrayList<Layout>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPULayoutInfoListResponse.Layouts.Length"); i++) {
			Layout layout = new Layout();
			layout.setLayoutId(_ctx.longValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].LayoutId"));
			layout.setName(_ctx.stringValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Name"));
			layout.setAudioMixCount(_ctx.integerValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].AudioMixCount"));

			List<PanesItem> panes = new ArrayList<PanesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes.Length"); j++) {
				PanesItem panesItem = new PanesItem();
				panesItem.setPaneId(_ctx.integerValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].PaneId"));
				panesItem.setMajorPane(_ctx.integerValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].MajorPane"));
				panesItem.setX(_ctx.floatValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].X"));
				panesItem.setY(_ctx.floatValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].Y"));
				panesItem.setWidth(_ctx.floatValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].Width"));
				panesItem.setHeight(_ctx.floatValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].Height"));
				panesItem.setZOrder(_ctx.integerValue("DescribeMPULayoutInfoListResponse.Layouts["+ i +"].Panes["+ j +"].ZOrder"));

				panes.add(panesItem);
			}
			layout.setPanes(panes);

			layouts.add(layout);
		}
		describeMPULayoutInfoListResponse.setLayouts(layouts);
	 
	 	return describeMPULayoutInfoListResponse;
	}
}