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

import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackGroupByTechstackResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackGroupByTechstackResponse.CountItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBuildpackGroupByTechstackResponseUnmarshaller {

	public static DescribeBuildpackGroupByTechstackResponse unmarshall(DescribeBuildpackGroupByTechstackResponse describeBuildpackGroupByTechstackResponse, UnmarshallerContext _ctx) {
		
		describeBuildpackGroupByTechstackResponse.setRequestId(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.RequestId"));
		describeBuildpackGroupByTechstackResponse.setResultCode(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.ResultCode"));
		describeBuildpackGroupByTechstackResponse.setResultMessage(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.ResultMessage"));

		List<CountItem> count = new ArrayList<CountItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBuildpackGroupByTechstackResponse.Count.Length"); i++) {
			CountItem countItem = new CountItem();
			countItem.setBuildpackCount(_ctx.longValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].BuildpackCount"));
			countItem.setCreationTime(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].CreationTime"));
			countItem.setDescription(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].Description"));
			countItem.setExtraInfo(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].ExtraInfo"));
			countItem.setId(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].Id"));
			countItem.setIdentity(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].Identity"));
			countItem.setModificationTime(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].ModificationTime"));
			countItem.setName(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].Name"));
			countItem.setScope(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].Scope"));
			countItem.setStatus(_ctx.stringValue("DescribeBuildpackGroupByTechstackResponse.Count["+ i +"].Status"));

			count.add(countItem);
		}
		describeBuildpackGroupByTechstackResponse.setCount(count);
	 
	 	return describeBuildpackGroupByTechstackResponse;
	}
}