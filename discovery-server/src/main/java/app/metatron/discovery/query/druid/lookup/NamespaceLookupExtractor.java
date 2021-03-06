/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.metatron.discovery.query.druid.lookup;

import com.fasterxml.jackson.annotation.JsonTypeName;

import app.metatron.discovery.query.druid.lookup.namespace.ExtractionNamespace;

/**
 * Created by kyungtaak on 2017. 4. 20..
 */
@JsonTypeName("cachedNamespace")
public class NamespaceLookupExtractor implements LookupExtractor {

  private ExtractionNamespace extractionNamespace;
  private long firstCacheTimeout;
  private boolean injective;

  public NamespaceLookupExtractor() {
  }

  public NamespaceLookupExtractor(ExtractionNamespace extractionNamespace, long firstCacheTimeout, boolean injective) {
    this.extractionNamespace = extractionNamespace;
    this.firstCacheTimeout = firstCacheTimeout;
    this.injective = injective;
  }

  public ExtractionNamespace getExtractionNamespace() {
    return extractionNamespace;
  }

  public void setExtractionNamespace(ExtractionNamespace extractionNamespace) {
    this.extractionNamespace = extractionNamespace;
  }

  public long getFirstCacheTimeout() {
    return firstCacheTimeout;
  }

  public void setFirstCacheTimeout(long firstCacheTimeout) {
    this.firstCacheTimeout = firstCacheTimeout;
  }

  public boolean isInjective() {
    return injective;
  }

  public void setInjective(boolean injective) {
    this.injective = injective;
  }
}
