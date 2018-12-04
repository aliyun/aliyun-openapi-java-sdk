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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.GetBlockchainCreateTaskResponse;
import com.aliyuncs.baas.model.v20180731.GetBlockchainCreateTaskResponse.Result;
import com.aliyuncs.baas.model.v20180731.GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasksItem;
import com.aliyuncs.baas.model.v20180731.GetBlockchainCreateTaskResponse.Result.Pagination;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBlockchainCreateTaskResponseUnmarshaller {

	public static GetBlockchainCreateTaskResponse unmarshall(GetBlockchainCreateTaskResponse getBlockchainCreateTaskResponse, UnmarshallerContext context) {
		
		getBlockchainCreateTaskResponse.setRequestId(context.stringValue("GetBlockchainCreateTaskResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(context.integerValue("GetBlockchainCreateTaskResponse.Result.Pagination.PageSize"));
		pagination.setCurrent(context.integerValue("GetBlockchainCreateTaskResponse.Result.Pagination.Current"));
		pagination.setTotal(context.integerValue("GetBlockchainCreateTaskResponse.Result.Pagination.Total"));
		result.setPagination(pagination);

		List<BlockchainCreateTasksItem> blockchainCreateTasks = new ArrayList<BlockchainCreateTasksItem>();
		for (int i = 0; i < context.lengthValue("GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasks.Length"); i++) {
			BlockchainCreateTasksItem blockchainCreateTasksItem = new BlockchainCreateTasksItem();
			blockchainCreateTasksItem.setBizid(context.stringValue("GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Bizid"));
			blockchainCreateTasksItem.setName(context.stringValue("GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Name"));
			blockchainCreateTasksItem.setStatus(context.stringValue("GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Status"));
			blockchainCreateTasksItem.setMemo(context.stringValue("GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Memo"));
			blockchainCreateTasksItem.setCreateTime(context.longValue("GetBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].CreateTime"));

			blockchainCreateTasks.add(blockchainCreateTasksItem);
		}
		result.setBlockchainCreateTasks(blockchainCreateTasks);
		getBlockchainCreateTaskResponse.setResult(result);
	 
	 	return getBlockchainCreateTaskResponse;
	}
}