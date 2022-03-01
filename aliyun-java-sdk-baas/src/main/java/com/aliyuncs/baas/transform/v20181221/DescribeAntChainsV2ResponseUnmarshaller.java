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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainsV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainsV2Response.Result.AntChainsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainsV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainsV2ResponseUnmarshaller {

	public static DescribeAntChainsV2Response unmarshall(DescribeAntChainsV2Response describeAntChainsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainsV2Response.RequestId"));
		describeAntChainsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainsV2Response.HttpStatusCode"));
		describeAntChainsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainsV2Response.Success"));
		describeAntChainsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainsV2Response.ResultMessage"));
		describeAntChainsV2Response.setCode(_ctx.stringValue("DescribeAntChainsV2Response.Code"));
		describeAntChainsV2Response.setMessage(_ctx.stringValue("DescribeAntChainsV2Response.Message"));
		describeAntChainsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainsV2Response.ResultCode"));

		Result result = new Result();
		result.setIsExist(_ctx.booleanValue("DescribeAntChainsV2Response.Result.IsExist"));

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainsV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainsV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainsV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AntChainsItem> antChains = new ArrayList<AntChainsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainsV2Response.Result.AntChains.Length"); i++) {
			AntChainsItem antChainsItem = new AntChainsItem();
			antChainsItem.setExpireTime(_ctx.longValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].ExpireTime"));
			antChainsItem.setCreateTime(_ctx.longValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].CreateTime"));
			antChainsItem.setRestStatus(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].RestStatus"));
			antChainsItem.setChainType(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].ChainType"));
			antChainsItem.setIsAdmin(_ctx.booleanValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].IsAdmin"));
			antChainsItem.setMerkleTreeSuit(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].MerkleTreeSuit"));
			antChainsItem.setMemberStatus(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].MemberStatus"));
			antChainsItem.setInstanceId(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].InstanceId"));
			antChainsItem.setRegionId(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].RegionId"));
			antChainsItem.setAntChainName(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].AntChainName"));
			antChainsItem.setNetwork(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].Network"));
			antChainsItem.setMonitorStatus(_ctx.booleanValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].MonitorStatus"));
			antChainsItem.setTlsAlgo(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].TlsAlgo"));
			antChainsItem.setVersion(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].Version"));
			antChainsItem.setCipherSuit(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].CipherSuit"));
			antChainsItem.setResourceSize(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].ResourceSize"));
			antChainsItem.setNodeNum(_ctx.integerValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].NodeNum"));
			antChainsItem.setAntChainId(_ctx.stringValue("DescribeAntChainsV2Response.Result.AntChains["+ i +"].AntChainId"));

			antChains.add(antChainsItem);
		}
		result.setAntChains(antChains);
		describeAntChainsV2Response.setResult(result);
	 
	 	return describeAntChainsV2Response;
	}
}