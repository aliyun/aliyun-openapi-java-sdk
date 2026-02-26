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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author xiaohui
 * @version 1.4.0
 */
public class DeleteDataCacheRequest extends RpcAcsRequest<DeleteDataCacheResponse>{

    public DeleteDataCacheRequest() {
        super("Eci", "2018-08-08", "DeleteDataCache", "eci");
        setMethod(MethodType.POST);
    }
    private String dataCacheId;

    private String clientToken;

    private String bucket;

    private String path;

    public String getDataCacheId() {
        return dataCacheId;
    }

    public void setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId;
        if (dataCacheId != null) {
            putQueryParameter("DataCacheId", dataCacheId);
        }
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        if (clientToken != null) {
            putQueryParameter("ClientToken", clientToken);
        }
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
        if (bucket != null) {
            putQueryParameter("Bucket", bucket);
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        if (path != null) {
            putQueryParameter("Path", path);
        }
    }

    @Override
    public Class<DeleteDataCacheResponse> getResponseClass() {
        return DeleteDataCacheResponse.class;
    }
}
