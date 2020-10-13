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

import com.aliyuncs.rtc.model.v20180111.DescribeMPULayoutInfoResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeMPULayoutInfoResponse.Layout;
import com.aliyuncs.rtc.model.v20180111.DescribeMPULayoutInfoResponse.Layout.PanesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMPULayoutInfoResponseUnmarshaller {

	public static DescribeMPULayoutInfoResponse unmarshall(DescribeMPULayoutInfoResponse describeMPULayoutInfoResponse, UnmarshallerContext _ctx) {
		
		describeMPULayoutInfoResponse.setRequestId(_ctx.stringValue("DescribeMPULayoutInfoResponse.RequestId"));

		Layout layout = new Layout();
		layout.setLayoutId(_ctx.longValue("DescribeMPULayoutInfoResponse.Layout.LayoutId"));
		layout.setName(_ctx.stringValue("DescribeMPULayoutInfoResponse.Layout.Name"));
		layout.setAudioMixCount(_ctx.integerValue("DescribeMPULayoutInfoResponse.Layout.AudioMixCount"));

		List<PanesItem> panes = new ArrayList<PanesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPULayoutInfoResponse.Layout.Panes.Length"); i++) {
			PanesItem panesItem = new PanesItem();
			panesItem.setPaneId(_ctx.integerValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].PaneId"));
			panesItem.setMajorPane(_ctx.integerValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].MajorPane"));
			panesItem.setX(_ctx.floatValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].X"));
			panesItem.setY(_ctx.floatValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].Y"));
			panesItem.setWidth(_ctx.floatValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].Width"));
			panesItem.setHeight(_ctx.floatValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].Height"));
			panesItem.setZOrder(_ctx.integerValue("DescribeMPULayoutInfoResponse.Layout.Panes["+ i +"].ZOrder"));

			panes.add(panesItem);
		}
		layout.setPanes(panes);
		describeMPULayoutInfoResponse.setLayout(layout);
	 
	 	return describeMPULayoutInfoResponse;
	}
}