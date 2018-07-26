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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.SearchManualDagNodeInstanceResponse;
import com.aliyuncs.dataworks_public.model.v20180601.SearchManualDagNodeInstanceResponse.NodeInsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchManualDagNodeInstanceResponseUnmarshaller {

	public static SearchManualDagNodeInstanceResponse unmarshall(SearchManualDagNodeInstanceResponse searchManualDagNodeInstanceResponse, UnmarshallerContext context) {
		
		searchManualDagNodeInstanceResponse.setRequestId(context.stringValue("SearchManualDagNodeInstanceResponse.RequestId"));
		searchManualDagNodeInstanceResponse.setErrCode(context.stringValue("SearchManualDagNodeInstanceResponse.ErrCode"));
		searchManualDagNodeInstanceResponse.setErrMsg(context.stringValue("SearchManualDagNodeInstanceResponse.ErrMsg"));
		searchManualDagNodeInstanceResponse.setSuccess(context.booleanValue("SearchManualDagNodeInstanceResponse.Success"));

		List<NodeInsInfo> data = new ArrayList<NodeInsInfo>();
		for (int i = 0; i < context.lengthValue("SearchManualDagNodeInstanceResponse.Data.Length"); i++) {
			NodeInsInfo nodeInsInfo = new NodeInsInfo();
			nodeInsInfo.setInstanceId(context.longValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].InstanceId"));
			nodeInsInfo.setDagId(context.longValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].DagId"));
			nodeInsInfo.setDagType(context.integerValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].DagType"));
			nodeInsInfo.setStatus(context.integerValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].Status"));
			nodeInsInfo.setBizdate(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].Bizdate"));
			nodeInsInfo.setParaValue(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].ParaValue"));
			nodeInsInfo.setFinishTime(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].FinishTime"));
			nodeInsInfo.setBeginWaitTimeTime(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].BeginWaitTimeTime"));
			nodeInsInfo.setBeginWaitResTime(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].BeginWaitResTime"));
			nodeInsInfo.setBeginRunningTime(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].BeginRunningTime"));
			nodeInsInfo.setCreateTime(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].CreateTime"));
			nodeInsInfo.setModifyTime(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].ModifyTime"));
			nodeInsInfo.setNodeName(context.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].NodeName"));

			data.add(nodeInsInfo);
		}
		searchManualDagNodeInstanceResponse.setData(data);
	 
	 	return searchManualDagNodeInstanceResponse;
	}
}