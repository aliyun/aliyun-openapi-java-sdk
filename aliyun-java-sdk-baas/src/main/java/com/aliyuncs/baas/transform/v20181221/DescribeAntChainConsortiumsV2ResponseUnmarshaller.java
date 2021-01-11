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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsV2Response.Result.AntConsortiumsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainConsortiumsV2ResponseUnmarshaller {

	public static DescribeAntChainConsortiumsV2Response unmarshall(DescribeAntChainConsortiumsV2Response describeAntChainConsortiumsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainConsortiumsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.RequestId"));
		describeAntChainConsortiumsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.ResultCode"));
		describeAntChainConsortiumsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.ResultMessage"));
		describeAntChainConsortiumsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainConsortiumsV2Response.Success"));
		describeAntChainConsortiumsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.HttpStatusCode"));
		describeAntChainConsortiumsV2Response.setCode(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Code"));
		describeAntChainConsortiumsV2Response.setMessage(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Message"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainConsortiumsV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainConsortiumsV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainConsortiumsV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AntConsortiumsItem> antConsortiums = new ArrayList<AntConsortiumsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums.Length"); i++) {
			AntConsortiumsItem antConsortiumsItem = new AntConsortiumsItem();
			antConsortiumsItem.setChainNum(_ctx.longValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].ChainNum"));
			antConsortiumsItem.setMemberNum(_ctx.longValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].MemberNum"));
			antConsortiumsItem.setCreateTime(_ctx.longValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].CreateTime"));
			antConsortiumsItem.setRole(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].Role"));
			antConsortiumsItem.setConsortiumId(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].ConsortiumId"));
			antConsortiumsItem.setStatus(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].Status"));
			antConsortiumsItem.setConsortiumName(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].ConsortiumName"));
			antConsortiumsItem.setConsortiumDescription(_ctx.stringValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].ConsortiumDescription"));
			antConsortiumsItem.setIsEmptyConsortium(_ctx.booleanValue("DescribeAntChainConsortiumsV2Response.Result.AntConsortiums["+ i +"].IsEmptyConsortium"));

			antConsortiums.add(antConsortiumsItem);
		}
		result.setAntConsortiums(antConsortiums);
		describeAntChainConsortiumsV2Response.setResult(result);
	 
	 	return describeAntChainConsortiumsV2Response;
	}
}