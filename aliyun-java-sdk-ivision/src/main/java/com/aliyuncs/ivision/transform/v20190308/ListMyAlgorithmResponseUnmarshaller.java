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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.ListMyAlgorithmResponse;
import com.aliyuncs.ivision.model.v20190308.ListMyAlgorithmResponse.Data;
import com.aliyuncs.ivision.model.v20190308.ListMyAlgorithmResponse.Data.AlgorithmListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMyAlgorithmResponseUnmarshaller {

	public static ListMyAlgorithmResponse unmarshall(ListMyAlgorithmResponse listMyAlgorithmResponse, UnmarshallerContext _ctx) {
		
		listMyAlgorithmResponse.setRequestId(_ctx.stringValue("ListMyAlgorithmResponse.RequestId"));
		listMyAlgorithmResponse.setMessage(_ctx.stringValue("ListMyAlgorithmResponse.Message"));
		listMyAlgorithmResponse.setCode(_ctx.stringValue("ListMyAlgorithmResponse.Code"));
		listMyAlgorithmResponse.setSuccess(_ctx.booleanValue("ListMyAlgorithmResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListMyAlgorithmResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListMyAlgorithmResponse.Data.PageNumber"));
		data.setTotalCount(_ctx.integerValue("ListMyAlgorithmResponse.Data.TotalCount"));

		List<AlgorithmListItem> algorithmList = new ArrayList<AlgorithmListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMyAlgorithmResponse.Data.AlgorithmList.Length"); i++) {
			AlgorithmListItem algorithmListItem = new AlgorithmListItem();
			algorithmListItem.setAlgorithmName(_ctx.stringValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].AlgorithmName"));
			algorithmListItem.setDeployRegion(_ctx.stringValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].DeployRegion"));
			algorithmListItem.setCurrentMonthCount(_ctx.integerValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].CurrentMonthCount"));
			algorithmListItem.setAlgorithmCode(_ctx.stringValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].AlgorithmCode"));
			algorithmListItem.setApiDocUrl(_ctx.stringValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].ApiDocUrl"));
			algorithmListItem.setYesterdayCount(_ctx.integerValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].YesterdayCount"));
			algorithmListItem.setAlgorithmOrder(_ctx.integerValue("ListMyAlgorithmResponse.Data.AlgorithmList["+ i +"].AlgorithmOrder"));

			algorithmList.add(algorithmListItem);
		}
		data.setAlgorithmList(algorithmList);
		listMyAlgorithmResponse.setData(data);
	 
	 	return listMyAlgorithmResponse;
	}
}