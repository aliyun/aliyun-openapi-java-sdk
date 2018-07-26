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

import com.aliyuncs.dataworks_public.model.v20180601.SearchNodeInstanceListResponse;
import com.aliyuncs.dataworks_public.model.v20180601.SearchNodeInstanceListResponse.NodeInsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchNodeInstanceListResponseUnmarshaller {

	public static SearchNodeInstanceListResponse unmarshall(SearchNodeInstanceListResponse searchNodeInstanceListResponse, UnmarshallerContext context) {
		
		searchNodeInstanceListResponse.setRequestId(context.stringValue("SearchNodeInstanceListResponse.RequestId"));
		searchNodeInstanceListResponse.setErrCode(context.stringValue("SearchNodeInstanceListResponse.ErrCode"));
		searchNodeInstanceListResponse.setErrMsg(context.stringValue("SearchNodeInstanceListResponse.ErrMsg"));
		searchNodeInstanceListResponse.setSuccess(context.booleanValue("SearchNodeInstanceListResponse.Success"));

		List<NodeInsInfo> data = new ArrayList<NodeInsInfo>();
		for (int i = 0; i < context.lengthValue("SearchNodeInstanceListResponse.Data.Length"); i++) {
			NodeInsInfo nodeInsInfo = new NodeInsInfo();
			nodeInsInfo.setInstanceId(context.longValue("SearchNodeInstanceListResponse.Data["+ i +"].InstanceId"));
			nodeInsInfo.setDagId(context.longValue("SearchNodeInstanceListResponse.Data["+ i +"].DagId"));
			nodeInsInfo.setDagType(context.integerValue("SearchNodeInstanceListResponse.Data["+ i +"].DagType"));
			nodeInsInfo.setStatus(context.integerValue("SearchNodeInstanceListResponse.Data["+ i +"].Status"));
			nodeInsInfo.setBizdate(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].Bizdate"));
			nodeInsInfo.setParaValue(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].ParaValue"));
			nodeInsInfo.setFinishTime(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].FinishTime"));
			nodeInsInfo.setBeginWaitTimeTime(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].BeginWaitTimeTime"));
			nodeInsInfo.setBeginWaitResTime(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].BeginWaitResTime"));
			nodeInsInfo.setBeginRunningTime(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].BeginRunningTime"));
			nodeInsInfo.setCreateTime(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].CreateTime"));
			nodeInsInfo.setModifyTime(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].ModifyTime"));
			nodeInsInfo.setNodeName(context.stringValue("SearchNodeInstanceListResponse.Data["+ i +"].NodeName"));

			data.add(nodeInsInfo);
		}
		searchNodeInstanceListResponse.setData(data);
	 
	 	return searchNodeInstanceListResponse;
	}
}