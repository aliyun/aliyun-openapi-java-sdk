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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.ApiKeyAuthParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.BasicAuthParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.InvocationHttpParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.InvocationHttpParameters.BodyParametersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.InvocationHttpParameters.HeaderParametersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.InvocationHttpParameters.QueryStringParametersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.OAuthParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.OAuthParameters.ClientParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.OAuthParameters.OAuthHttpParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.OAuthParameters.OAuthHttpParameters.BodyParametersItem4;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.OAuthParameters.OAuthHttpParameters.HeaderParametersItem5;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.AuthParameters.OAuthParameters.OAuthHttpParameters.QueryStringParametersItem6;
import com.aliyuncs.eventbridge.model.v20200401.ListConnectionsResponse.Data.ConnectionsItem.NetworkParameters;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectionsResponseUnmarshaller {

	public static ListConnectionsResponse unmarshall(ListConnectionsResponse listConnectionsResponse, UnmarshallerContext _ctx) {
		
		listConnectionsResponse.setRequestId(_ctx.stringValue("ListConnectionsResponse.RequestId"));
		listConnectionsResponse.setMessage(_ctx.stringValue("ListConnectionsResponse.Message"));
		listConnectionsResponse.setCode(_ctx.stringValue("ListConnectionsResponse.Code"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListConnectionsResponse.Data.NextToken"));
		data.setTotal(_ctx.floatValue("ListConnectionsResponse.Data.Total"));
		data.setMaxResults(_ctx.floatValue("ListConnectionsResponse.Data.MaxResults"));

		List<ConnectionsItem> connections = new ArrayList<ConnectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectionsResponse.Data.Connections.Length"); i++) {
			ConnectionsItem connectionsItem = new ConnectionsItem();
			connectionsItem.setConnectionName(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].ConnectionName"));
			connectionsItem.setDescription(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].Description"));
			connectionsItem.setId(_ctx.longValue("ListConnectionsResponse.Data.Connections["+ i +"].Id"));
			connectionsItem.setGmtCreate(_ctx.longValue("ListConnectionsResponse.Data.Connections["+ i +"].GmtCreate"));
			connectionsItem.setApiDestinationName(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].ApiDestinationName"));

			NetworkParameters networkParameters = new NetworkParameters();
			networkParameters.setNetworkType(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].NetworkParameters.NetworkType"));
			networkParameters.setVpcId(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].NetworkParameters.VpcId"));
			networkParameters.setVswitcheId(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].NetworkParameters.VswitcheId"));
			networkParameters.setSecurityGroupId(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].NetworkParameters.SecurityGroupId"));
			connectionsItem.setNetworkParameters(networkParameters);

			AuthParameters authParameters = new AuthParameters();
			authParameters.setAuthorizationType(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.AuthorizationType"));

			ApiKeyAuthParameters apiKeyAuthParameters = new ApiKeyAuthParameters();
			apiKeyAuthParameters.setApiKeyName(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.ApiKeyAuthParameters.ApiKeyName"));
			apiKeyAuthParameters.setApiKeyValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.ApiKeyAuthParameters.ApiKeyValue"));
			authParameters.setApiKeyAuthParameters(apiKeyAuthParameters);

			BasicAuthParameters basicAuthParameters = new BasicAuthParameters();
			basicAuthParameters.setPassword(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.BasicAuthParameters.Password"));
			basicAuthParameters.setUsername(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.BasicAuthParameters.Username"));
			authParameters.setBasicAuthParameters(basicAuthParameters);

			InvocationHttpParameters invocationHttpParameters = new InvocationHttpParameters();

			List<BodyParametersItem> bodyParameters = new ArrayList<BodyParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.BodyParameters.Length"); j++) {
				BodyParametersItem bodyParametersItem = new BodyParametersItem();
				bodyParametersItem.setIsValueSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.BodyParameters["+ j +"].IsValueSecret"));
				bodyParametersItem.setKey(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.BodyParameters["+ j +"].Key"));
				bodyParametersItem.setValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.BodyParameters["+ j +"].Value"));

				bodyParameters.add(bodyParametersItem);
			}
			invocationHttpParameters.setBodyParameters(bodyParameters);

			List<HeaderParametersItem> headerParameters = new ArrayList<HeaderParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.HeaderParameters.Length"); j++) {
				HeaderParametersItem headerParametersItem = new HeaderParametersItem();
				headerParametersItem.setIsValueSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.HeaderParameters["+ j +"].IsValueSecret"));
				headerParametersItem.setKey(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.HeaderParameters["+ j +"].Key"));
				headerParametersItem.setValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.HeaderParameters["+ j +"].Value"));

				headerParameters.add(headerParametersItem);
			}
			invocationHttpParameters.setHeaderParameters(headerParameters);

			List<QueryStringParametersItem> queryStringParameters = new ArrayList<QueryStringParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.QueryStringParameters.Length"); j++) {
				QueryStringParametersItem queryStringParametersItem = new QueryStringParametersItem();
				queryStringParametersItem.setIsValueSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.QueryStringParameters["+ j +"].IsValueSecret"));
				queryStringParametersItem.setKey(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.QueryStringParameters["+ j +"].Key"));
				queryStringParametersItem.setValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.InvocationHttpParameters.QueryStringParameters["+ j +"].Value"));

				queryStringParameters.add(queryStringParametersItem);
			}
			invocationHttpParameters.setQueryStringParameters(queryStringParameters);
			authParameters.setInvocationHttpParameters(invocationHttpParameters);

			OAuthParameters oAuthParameters = new OAuthParameters();
			oAuthParameters.setAuthorizationEndpoint(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.AuthorizationEndpoint"));
			oAuthParameters.setHttpMethod(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.HttpMethod"));

			ClientParameters clientParameters = new ClientParameters();
			clientParameters.setClientID(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.ClientParameters.ClientID"));
			clientParameters.setClientSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.ClientParameters.ClientSecret"));
			oAuthParameters.setClientParameters(clientParameters);

			OAuthHttpParameters oAuthHttpParameters = new OAuthHttpParameters();

			List<BodyParametersItem4> bodyParameters1 = new ArrayList<BodyParametersItem4>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.BodyParameters.Length"); j++) {
				BodyParametersItem4 bodyParametersItem4 = new BodyParametersItem4();
				bodyParametersItem4.setIsValueSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.BodyParameters["+ j +"].IsValueSecret"));
				bodyParametersItem4.setKey(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.BodyParameters["+ j +"].Key"));
				bodyParametersItem4.setValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.BodyParameters["+ j +"].Value"));

				bodyParameters1.add(bodyParametersItem4);
			}
			oAuthHttpParameters.setBodyParameters1(bodyParameters1);

			List<HeaderParametersItem5> headerParameters2 = new ArrayList<HeaderParametersItem5>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.HeaderParameters.Length"); j++) {
				HeaderParametersItem5 headerParametersItem5 = new HeaderParametersItem5();
				headerParametersItem5.setIsValueSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.HeaderParameters["+ j +"].IsValueSecret"));
				headerParametersItem5.setKey(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.HeaderParameters["+ j +"].Key"));
				headerParametersItem5.setValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.HeaderParameters["+ j +"].Value"));

				headerParameters2.add(headerParametersItem5);
			}
			oAuthHttpParameters.setHeaderParameters2(headerParameters2);

			List<QueryStringParametersItem6> queryStringParameters3 = new ArrayList<QueryStringParametersItem6>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.QueryStringParameters.Length"); j++) {
				QueryStringParametersItem6 queryStringParametersItem6 = new QueryStringParametersItem6();
				queryStringParametersItem6.setIsValueSecret(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.QueryStringParameters["+ j +"].IsValueSecret"));
				queryStringParametersItem6.setKey(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.QueryStringParameters["+ j +"].Key"));
				queryStringParametersItem6.setValue(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].AuthParameters.OAuthParameters.OAuthHttpParameters.QueryStringParameters["+ j +"].Value"));

				queryStringParameters3.add(queryStringParametersItem6);
			}
			oAuthHttpParameters.setQueryStringParameters3(queryStringParameters3);
			oAuthParameters.setOAuthHttpParameters(oAuthHttpParameters);
			authParameters.setOAuthParameters(oAuthParameters);
			connectionsItem.setAuthParameters(authParameters);

			connections.add(connectionsItem);
		}
		data.setConnections(connections);
		listConnectionsResponse.setData(data);
	 
	 	return listConnectionsResponse;
	}
}