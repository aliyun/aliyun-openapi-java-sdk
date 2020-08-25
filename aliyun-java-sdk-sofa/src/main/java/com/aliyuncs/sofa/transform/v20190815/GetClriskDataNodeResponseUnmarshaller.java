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

import com.aliyuncs.sofa.model.v20190815.GetClriskDataNodeResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskDataNodeResponse.RelatedEntranceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskDataNodeResponseUnmarshaller {

	public static GetClriskDataNodeResponse unmarshall(GetClriskDataNodeResponse getClriskDataNodeResponse, UnmarshallerContext _ctx) {
		
		getClriskDataNodeResponse.setRequestId(_ctx.stringValue("GetClriskDataNodeResponse.RequestId"));
		getClriskDataNodeResponse.setResultCode(_ctx.stringValue("GetClriskDataNodeResponse.ResultCode"));
		getClriskDataNodeResponse.setResultMessage(_ctx.stringValue("GetClriskDataNodeResponse.ResultMessage"));
		getClriskDataNodeResponse.setDescription(_ctx.stringValue("GetClriskDataNodeResponse.Description"));
		getClriskDataNodeResponse.setId(_ctx.stringValue("GetClriskDataNodeResponse.Id"));
		getClriskDataNodeResponse.setName(_ctx.stringValue("GetClriskDataNodeResponse.Name"));
		getClriskDataNodeResponse.setOdpsProject(_ctx.stringValue("GetClriskDataNodeResponse.OdpsProject"));
		getClriskDataNodeResponse.setTableAuthDescription(_ctx.stringValue("GetClriskDataNodeResponse.TableAuthDescription"));
		getClriskDataNodeResponse.setTableName(_ctx.stringValue("GetClriskDataNodeResponse.TableName"));
		getClriskDataNodeResponse.setUpdateTime(_ctx.stringValue("GetClriskDataNodeResponse.UpdateTime"));
		getClriskDataNodeResponse.setUpdateUser(_ctx.stringValue("GetClriskDataNodeResponse.UpdateUser"));

		List<RelatedEntranceListItem> relatedEntranceList = new ArrayList<RelatedEntranceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskDataNodeResponse.RelatedEntranceList.Length"); i++) {
			RelatedEntranceListItem relatedEntranceListItem = new RelatedEntranceListItem();
			relatedEntranceListItem.setId(_ctx.stringValue("GetClriskDataNodeResponse.RelatedEntranceList["+ i +"].Id"));
			relatedEntranceListItem.setModelCode(_ctx.stringValue("GetClriskDataNodeResponse.RelatedEntranceList["+ i +"].ModelCode"));
			relatedEntranceListItem.setName(_ctx.stringValue("GetClriskDataNodeResponse.RelatedEntranceList["+ i +"].Name"));
			relatedEntranceListItem.setUrl(_ctx.stringValue("GetClriskDataNodeResponse.RelatedEntranceList["+ i +"].Url"));

			relatedEntranceList.add(relatedEntranceListItem);
		}
		getClriskDataNodeResponse.setRelatedEntranceList(relatedEntranceList);
	 
	 	return getClriskDataNodeResponse;
	}
}