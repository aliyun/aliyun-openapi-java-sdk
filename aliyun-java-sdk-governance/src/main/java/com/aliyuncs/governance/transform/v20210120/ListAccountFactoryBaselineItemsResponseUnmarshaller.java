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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.ListAccountFactoryBaselineItemsResponse;
import com.aliyuncs.governance.model.v20210120.ListAccountFactoryBaselineItemsResponse.BaselineItem;
import com.aliyuncs.governance.model.v20210120.ListAccountFactoryBaselineItemsResponse.BaselineItem.DependsOnItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountFactoryBaselineItemsResponseUnmarshaller {

	public static ListAccountFactoryBaselineItemsResponse unmarshall(ListAccountFactoryBaselineItemsResponse listAccountFactoryBaselineItemsResponse, UnmarshallerContext _ctx) {
		
		listAccountFactoryBaselineItemsResponse.setRequestId(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.RequestId"));
		listAccountFactoryBaselineItemsResponse.setNextToken(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.NextToken"));

		List<BaselineItem> baselineItems = new ArrayList<BaselineItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountFactoryBaselineItemsResponse.BaselineItems.Length"); i++) {
			BaselineItem baselineItem = new BaselineItem();
			baselineItem.setDescription(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].Description"));
			baselineItem.setName(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].Name"));
			baselineItem.setType(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].Type"));
			baselineItem.setVersion(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].Version"));

			List<DependsOnItem> dependsOn = new ArrayList<DependsOnItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].DependsOn.Length"); j++) {
				DependsOnItem dependsOnItem = new DependsOnItem();
				dependsOnItem.setName(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].DependsOn["+ j +"].Name"));
				dependsOnItem.setType(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].DependsOn["+ j +"].Type"));
				dependsOnItem.setVersion(_ctx.stringValue("ListAccountFactoryBaselineItemsResponse.BaselineItems["+ i +"].DependsOn["+ j +"].Version"));

				dependsOn.add(dependsOnItem);
			}
			baselineItem.setDependsOn(dependsOn);

			baselineItems.add(baselineItem);
		}
		listAccountFactoryBaselineItemsResponse.setBaselineItems(baselineItems);
	 
	 	return listAccountFactoryBaselineItemsResponse;
	}
}