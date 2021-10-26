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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDagsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDagsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListDagsResponse.Data.Dag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDagsResponseUnmarshaller {

	public static ListDagsResponse unmarshall(ListDagsResponse listDagsResponse, UnmarshallerContext _ctx) {
		
		listDagsResponse.setRequestId(_ctx.stringValue("ListDagsResponse.RequestId"));
		listDagsResponse.setHttpStatusCode(_ctx.integerValue("ListDagsResponse.HttpStatusCode"));
		listDagsResponse.setErrorMessage(_ctx.stringValue("ListDagsResponse.ErrorMessage"));
		listDagsResponse.setErrorCode(_ctx.stringValue("ListDagsResponse.ErrorCode"));
		listDagsResponse.setSuccess(_ctx.booleanValue("ListDagsResponse.Success"));

		Data data = new Data();

		List<Dag> dags = new ArrayList<Dag>();
		for (int i = 0; i < _ctx.lengthValue("ListDagsResponse.Data.Dags.Length"); i++) {
			Dag dag = new Dag();
			dag.setType(_ctx.stringValue("ListDagsResponse.Data.Dags["+ i +"].Type"));
			dag.setStatus(_ctx.stringValue("ListDagsResponse.Data.Dags["+ i +"].Status"));
			dag.setFinishTime(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].FinishTime"));
			dag.setCreateTime(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].CreateTime"));
			dag.setProjectId(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].ProjectId"));
			dag.setDagId(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].DagId"));
			dag.setGmtdate(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].Gmtdate"));
			dag.setStartTime(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].StartTime"));
			dag.setCreateUser(_ctx.stringValue("ListDagsResponse.Data.Dags["+ i +"].CreateUser"));
			dag.setBizdate(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].Bizdate"));
			dag.setName(_ctx.stringValue("ListDagsResponse.Data.Dags["+ i +"].Name"));
			dag.setModifyTime(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].ModifyTime"));
			dag.setOpSeq(_ctx.longValue("ListDagsResponse.Data.Dags["+ i +"].OpSeq"));

			dags.add(dag);
		}
		data.setDags(dags);
		listDagsResponse.setData(data);
	 
	 	return listDagsResponse;
	}
}